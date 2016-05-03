package pl.chelm.pwsz.congenial_giggle

import scala.math.signum
import scala.math.pow

class PointSegmentMapper {
  def resolve(point: Point): Segment = {
    var code: Int = 0;
    0 until point.length foreach {
      (index) =>
        {
          val position = pow(10, index).toInt
          val a = point(index)
          if (signum(a) >= 0) {
            code = code + position
          }
        }
    }
    Segment(code)
  }
}

object PointSegmentMapper {
  def apply(): PointSegmentMapper = new PointSegmentMapper()
}