package domain.library.cats
import cats.{Monoid, Semigroup}

object Demo {
  def try_semigroups(): Option[Int] = {
    Semigroup[Int].combine(1,2)
    Semigroup[List[Int]].combine(List(1,2,3), List(4,5,6))
    Semigroup[Option[Int]].combine(Some(44), Some(6))
  }
}
