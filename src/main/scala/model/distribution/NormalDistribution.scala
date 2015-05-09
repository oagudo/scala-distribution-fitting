package model.distribution

import sun.reflect.generics.reflectiveObjects.NotImplementedException

case class NormalDistribution(mu: Double, sigma: Double) extends Distribution[Double] {

  require(sigma > 0)

  private val impl = new breeze.stats.distributions.Gaussian(mu, sigma)

  def cdf(x: Double) : Double = impl.cdf(x)
  def invCdf(y: Double) : Double = impl.icdf(y)
  def pdf(x: Double) : Double = throw new NotImplementedException()
  def random() : Double = throw new NotImplementedException()
}