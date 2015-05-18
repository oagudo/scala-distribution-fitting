package model.distribution

class Sample(l: Seq[Double]) {
  val length = l.length
  val mean : Double = if (length == 0) 0 else l.sum / length
  val variance : Double = {
    if (length == 0) 0
    else l.map(x => scala.math.pow(x - mean, 2)).sum / length
  }
}
