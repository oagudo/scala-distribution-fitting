package model.distribution

object NormalDistributionFitter extends Fitter[NormalDistribution, Double] {
  def fit(sample: Sample) : NormalDistribution = NormalDistribution(sample.mean, scala.math.pow(sample.variance, 0.5))
}