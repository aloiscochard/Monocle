package monocle

import Monocle._
import Composition.Instances._
import Composition.Syntax._

object CompositionDemo {

  @Lenses // this annotation generate lenses in the companion object of Person
  case class Address(street: String)

  @Lenses // this annotation generate lenses in the companion object of Person
  case class Person(name: String, age: Int, address: Address)

  Person.address <> Address.street
}
