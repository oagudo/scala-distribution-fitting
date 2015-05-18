package model.distribution

import breeze.stats.distributions.Gaussian
import sun.reflect.generics.reflectiveObjects.NotImplementedException

case class NormalDistribution(mu: Double, sigma: Double) extends Distribution[Double] {

  require(sigma > 0)

  private val impl = new Gaussian(mu, sigma)

  def cdf(x: Double) : Double = impl.cdf(x)

  def invCdf(y: Double) : Double = {
    require(y >= 0);
    require(y <= 1);
    impl.icdf(y)
  }

  def pdf(x: Double) : Double = throw new NotImplementedException()

}