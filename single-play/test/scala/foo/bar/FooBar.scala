package foo.bar

import org.scalatest.{ FlatSpec, Matchers }

class FooBar extends FlatSpec with Matchers {
  "FooBar" should "be FooBar in single-play layout" in {
    succeed
  }
}
