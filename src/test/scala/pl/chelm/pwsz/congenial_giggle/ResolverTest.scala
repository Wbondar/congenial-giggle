package pl.chelm.pwsz.congenial_giggle

import org.scalatest.FlatSpec

class ResolverTest extends FlatSpec {
  "A resolver" must "always resolve to an area" in {
    val resolver : Resolver = Resolver()
    resolver.resolve(Point()).isInstanceOf[Area]
  }
}