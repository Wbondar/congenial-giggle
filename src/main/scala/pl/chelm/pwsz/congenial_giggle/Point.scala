package pl.chelm.pwsz.congenial_giggle

case class Point private (private val vector : Vector[Double]) extends IndexedSeq[Double] {
  assert(vector.size > 0)
  
  override def apply (index : Int) : Double = vector(index)
  
  override def length = vector.size
  
  override def size = length
}

object Point {
  def apply(coordinates : IndexedSeq[Double]) : Point = {
    if (coordinates.size <= 0) Point(0.0)
    else new Point(coordinates.toVector)
  }
  
  def apply(a : Double*) : Point = apply(a.toIndexedSeq)
}