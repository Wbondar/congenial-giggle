package pl.chelm.pwsz.congenial_giggle

abstract class Resolver {
  def resolve(point : Point) : Area
}

object Resolver {
  def apply() : Resolver = {
    throw new AssertionError("This method is yet to be implemented.")
  }
}