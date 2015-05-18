package model.fit

import model.distribution.{NormalDistribution, Distribution, Sample}

sealed trait Fitter[D <: Distribution[T], T] {
  def fit(sample: Sample) : D
}

object NormalDistributionFitter extends Fitter[NormalDistribution, Double] {
  def fit(sample: Sample) : NormalDistribution = NormalDistribution(sample.mean, scala.math.pow(sample.variance, 0.5))
}