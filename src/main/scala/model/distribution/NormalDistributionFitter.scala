package model.distribution

import sun.reflect.generics.reflectiveObjects.NotImplementedException

object NormalDistributionFitter extends Fitter[NormalDistribution, Double] {
  def fit(sample: Sample[Double]) : NormalDistribution =  throw new NotImplementedException()
}