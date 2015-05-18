package model.distribution

import model.fit.NormalDistributionFitter
import org.scalacheck.Gen
import org.scalacheck.Prop.forAll
import org.scalatest.FunSuite
import org.scalatest.prop.Checkers

import scala.math.abs

class NormalDistributionTest extends FunSuite with Checkers {

  final private val error = 1E-3
  final private val estimationError = 1E-1

  test("cdf and invCdf should be accurate enough") {

    val distGen = for {
      mean <- Gen.choose(1,100)
      sigma <- Gen.choose(1,50)
    } yield NormalDistribution(mean,sigma)

    forAll(distGen, Gen.choose(0.001,0.999)) { (dist, rnd) =>
      abs(dist.cdf(dist.invCdf(rnd)) - rnd) < error
    }.check
  }

  test("Normal distribution can be estimated from a set of values") {

    val dist = NormalDistribution(2, 0.5)
    val sample = new Sample((1 to 5000).map(x => dist.random()))
    val distFit = NormalDistributionFitter.fit(sample)

    check(abs(distFit.mu - dist.mu) < estimationError)
    check(abs(distFit.sigma - dist.sigma) < estimationError)
  }
}

