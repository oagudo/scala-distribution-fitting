package model.distribution

trait Fitter[D <: Distribution[T], T] {
  def fit(sample: Sample) : D
}
