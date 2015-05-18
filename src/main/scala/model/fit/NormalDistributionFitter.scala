package model.fit

import model.distribution.{NormalDistribution, Sample}

object NormalDistributionFitter extends Fitter[NormalDistribution, Double] {
  def fit(sample: Sample) : NormalDistribution = NormalDistribution(sample.mean, scala.math.pow(sample.variance, 0.5))
}