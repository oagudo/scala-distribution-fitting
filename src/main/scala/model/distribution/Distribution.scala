package model.distribution

trait Distribution[T] {
  def cdf(x: T) : Double
  def invCdf(y: Double) : T
  def pdf(x: T) : Double
  def random() : T = invCdf(UniformDistribution(0,1).random)
}