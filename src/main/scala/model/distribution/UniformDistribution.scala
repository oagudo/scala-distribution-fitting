package model.distribution

import breeze.stats.distributions.Uniform

case class UniformDistribution(low: Double, high: Double) extends Distribution[Double] {

  require (low <= high)

  private val impl = new Uniform(low, high)

  def cdf(x: Double) : Double = impl.cdf(x)

  def invCdf(y: Double) : Double = {
    require(y >= 0);
    require(y <= 1);
    impl.inverseCdf(y)
  }

  def pdf(x: Double) : Double = impl.pdf(x)

  override def random() : Double = impl.sample
}


