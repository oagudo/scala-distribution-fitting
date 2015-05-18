package model.fit

import model.distribution.{Distribution, Sample}

trait Fitter[D <: Distribution[T], T] {
  def fit(sample: Sample) : D
}
