package model.fit

import model.distribution.Distribution
import sun.reflect.generics.reflectiveObjects.NotImplementedException

sealed trait Probable {
  def Prob() : Double
}

case class DistributionFit[D <: Distribution[T], T](val dist : D) extends Probable {
  def Prob() = throw new NotImplementedException()
}

case class MassPoint(val value: Double, val repetition: Int) extends Probable {
  def Prob() = throw new NotImplementedException()
  override def toString = "MassPoint"
}
