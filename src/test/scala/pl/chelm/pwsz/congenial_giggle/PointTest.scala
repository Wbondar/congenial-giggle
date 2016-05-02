package pl.chelm.pwsz.congenial_giggle

import org.scalatest.FlatSpec

class PointTest extends FlatSpec {
  "A point" must "have at least one coordinate" in {
    assert(Point().size > 0)
  }
}