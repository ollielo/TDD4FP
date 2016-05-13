/**
  * Created by ollie on 5/12/16.
  */
trait List[+T]

case object myNil extends List[Nothing]

class ListSpec extends UnitSpec {
  describe("An empty list") {
    it("is called myNil") {
      val nil = myNil
    }
  }
  describe("An non-empty list") {
    it("is call Cons") {
      val myCons = Cons(1, myNil)
    }
  }
}

case class Cons[T](head: T, tail: List[T]) extends List[T]