package foo.bar

import org.scalatest.{ FlatSpec, Matchers }

class FooBar extends FlatSpec with Matchers {
  "FooBar" should "be FooBar in multi-plain layout in kernel module" in {
    succeed
  }
}
