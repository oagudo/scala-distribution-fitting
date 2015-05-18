package model.fit
import model.distribution.Sample
import org.scalatest.FunSuite
import org.scalatest.prop.Checkers

class SampleFitTest extends FunSuite with Checkers {

  test("a sample from an unknown Distribution is fit with the empirical distribution") {
    val s = new Sample((1 to 100).map(x => x.toDouble))
    val sFit = new SampleFit(s)
    check(sFit.getFit().forall(p => p.toString == "MassPoint"))
  }
}
