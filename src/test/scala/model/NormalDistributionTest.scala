package model

import math.abs
import model.distribution.NormalDistribution
import org.scalatest.FunSuite
import org.scalatest.prop.Checkers
import org.scalacheck.Gen
import org.scalacheck.Prop.forAll

class NormalDistributionTest extends FunSuite with Checkers {

  val error = 1E-3

  test("cdf and invCdf should be accurate enough") {

    val distGen = for {
      mean <- Gen.choose(1,100)
      sigma <- Gen.choose(1,50)
    } yield NormalDistribution(mean,sigma)

    forAll(distGen, Gen.choose(0.001,0.999)) { (dist, rnd) =>
      abs(dist.cdf(dist.invCdf(rnd)) - rnd) < error
    }.check
  }
}

