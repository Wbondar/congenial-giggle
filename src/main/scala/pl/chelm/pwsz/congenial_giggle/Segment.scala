package pl.chelm.pwsz.congenial_giggle

import scala.math.floor
import scala.math.log10

class Segment private (val code: Int) extends Equals {
  def contains(point: Point): Boolean = PointSegmentMapper().resolve(point).code == code

  val size = floor(log10(code)).toInt

  def canEqual(other: Any) = {
    other.isInstanceOf[pl.chelm.pwsz.congenial_giggle.Segment]
  }

  override def equals(other: Any) = {
    other match {
      case that: pl.chelm.pwsz.congenial_giggle.Segment => that.canEqual(Segment.this) && code == that.code
      case _ => false
    }
  }

  override def hashCode() = {
    val prime = 41
    prime + code.hashCode
  }
}

object Segment {
  val FirstQuarter = new Segment(11)
  val SecondQuarter = new Segment(10)
  val ThirdQuarter = new Segment(0)
  val FourthQuarter = new Segment(1)

  def apply(code: Int): Segment = new Segment(code)
}