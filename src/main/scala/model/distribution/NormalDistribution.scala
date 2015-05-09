package model.distribution

import sun.reflect.generics.reflectiveObjects.NotImplementedException

case class NormalDistribution(mu: Double, sigma: Double) extends Distribution[Double] {

  require(sigma > 0)

  def cdf(x: Double) : Double = throw new NotImplementedException()
  def invCdf(y: Double) : Double = throw new NotImplementedException()
  def pdf(x: Double) : Double = throw new NotImplementedException()
  def random() : Double = throw new NotImplementedException()
}
