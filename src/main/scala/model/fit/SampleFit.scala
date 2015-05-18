package model.fit

import model.distribution.Sample
import sun.reflect.generics.reflectiveObjects.NotImplementedException

case class SampleFit (val s: Sample) {
  def getFit() : List[Probable] = throw new NotImplementedException()
}
