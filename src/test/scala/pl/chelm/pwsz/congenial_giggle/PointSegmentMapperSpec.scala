package pl.chelm.pwsz.congenial_giggle

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class PointSegmentMapperSpec extends FlatSpec with Matchers {
  "A resolver" must "always resolve to an area" in {
    val resolver: PointSegmentMapper = PointSegmentMapper()
    assert(resolver.resolve(Point()).isInstanceOf[Segment])
  }

  it must "resolve (-1,-1) to third quarter" in {
    val point = Point(-1, -1)
    val area = PointSegmentMapper().resolve(point)
    area should be(Segment.ThirdQuarter)
    area.contains(point) should be(true)
  }

  it must "resolve (-1,0) to second quarter" in {
    val point = Point(-1, 0)
    val area = PointSegmentMapper().resolve(point)
    area should be(Segment.SecondQuarter)
    area.contains(point) should be(true)
  }

  it must "resolve (-1,1) to second quarter" in {
    val point = Point(-1, 1)
    val area = PointSegmentMapper().resolve(point)
    area should be(Segment.SecondQuarter)
    area.contains(point) should be(true)
  }

  it must "resolve (0,-1) to fourth quarter" in {
    val point = Point(0, -1)
    val area = PointSegmentMapper().resolve(point)
    area should be(Segment.FourthQuarter)
    area.contains(point) should be(true)
  }

  it must "resolve (0,0) to first quarter" in {
    val point = Point(0, 0)
    val area = PointSegmentMapper().resolve(point)
    area should be(Segment.FirstQuarter)
    area.contains(point) should be(true)
  }

  it must "resolve (0,1) to first quarter" in {
    val point = Point(0, 1)
    val area = PointSegmentMapper().resolve(point)
    area should be(Segment.FirstQuarter)
    area.contains(point) should be(true)
  }

  it must "resolve (1,-1) to fourth quarter" in {
    val point = Point(1, -1)
    val area = PointSegmentMapper().resolve(point)
    area should be(Segment.FourthQuarter)
    area.contains(point) should be(true)
  }

  it must "resolve (1,0) to first quarter" in {
    val point = Point(1, 0)
    val area = PointSegmentMapper().resolve(point)
    area should be(Segment.FirstQuarter)
    area.contains(point) should be(true)
  }

  it must "resolve (1,1) to first quarter" in {
    val point = Point(1, 1)
    val area = PointSegmentMapper().resolve(point)
    area should be(Segment.FirstQuarter)
    area.contains(point) should be(true)
  }
}