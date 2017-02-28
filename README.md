# pet-master-detail

First create a model with two classes and an object

```kotlin
data class Pet(val name: String, var age: Int)


data class Person(
        var firstName: String,
        var lastName: String,
        var email: String,
        val pets: MutableList<Pet> = mutableListOf()
        )

object data {
    val people: MutableList<Person> = mutableListOf()

    init {
        val kurt = Person("Kurt", "Hansen", "kurt@hansen.dk")
        val sonja = Person("Sonja", "Jönnson", "sonja@jonnson.se")
        val ib = Person("Ib", "Nebukanezer", "ib@neb.dk")

        kurt.pets.add(Pet("Rufus", 5))
        kurt.pets.add(Pet("Ninus", 3))

        sonja.pets.add(Pet("Felix", 10))
        sonja.pets.add(Pet("Garfield", 15))
        sonja.pets.add(Pet("Misser", 2))

        people.add(kurt)
        people.add(sonja)
        people.add(ib)

        }

    }
```

The `object` is an instance, so we can use it as a singleton.

