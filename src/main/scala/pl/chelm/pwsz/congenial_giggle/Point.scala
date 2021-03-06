package pl.chelm.pwsz.congenial_giggle

case class Point private (private val vector: Vector[Double]) extends IndexedSeq[Double] with Equals {
  assert(vector.size > 0)

  override def apply(index: Int): Double = vector(index)

  override def length = vector.size

  override def size = length

  override def canEqual(other: Any) = {
    other.isInstanceOf[pl.chelm.pwsz.congenial_giggle.Point]
  }

  override def equals(other: Any) = {
    other match {
      case that: pl.chelm.pwsz.congenial_giggle.Point => that.canEqual(Point.this) && vector == that.vector
      case _ => false
    }
  }

  override def hashCode() = {
    val prime = 7
    prime + vector.hashCode
  }
}

object Point {
  def apply(coordinates: IndexedSeq[Double]): Point = {
    if (coordinates.size <= 0) Point(0.0)
    else new Point(coordinates.toVector)
  }

  def apply(a: Double*): Point = apply(a.toIndexedSeq)
}