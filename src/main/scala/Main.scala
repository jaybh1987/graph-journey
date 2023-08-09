import cats.Monoid
import cats.Semigroup
import cats.implicits.catsSyntaxSemigroup
import cats.instances.string._
import cats.instances.int._
import cats.instances.option._
import scala.language.higherKinds
import cats.Functor
import cats.instances.list._
import cats.instances.option._

/*
Rules

Associative law
Identity law
*/
/*

trait Semigroup[A] {
  def combine(x:A,y:A):A
}

trait Monoid[A] extends Semigroup[A] {
  def empty:A
}
*/

object Main extends App {
/*
  implicit val intAdditionMonoid: Monoid[Int] = new Monoid[Int] {
    def empty: Int = 0
    def combine(x: Int, y: Int): Int = x + y
  }
*/

  val str = "Hi" |+| "There" |+| Monoid[String].empty

  def add(x:List[Int]) = {
    x.foldLeft(Monoid[Int].empty)(_ |+| _)
  }

  def addGen[A](x:List[A])(implicit monoid: Monoid[A]):A = {
    x.foldLeft(Monoid[A].empty)(_ |+| _)

  }

  val l = List(1,2,3)

  val lst = Functor[List].map(l)(_ + 10)

}