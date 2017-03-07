package dk.cphbusiness.template.model

import android.content.Context

data class Pet(val name: String, var age: Int)

data class Person(
        var firstName: String,
        var lastName: String,
        var email: String,
        val pets: MutableList<Pet> = mutableListOf()
        )

/*
    : Map<String, Any?> {
    override val entries: Set<Map.Entry<String, Any?>>
        get() = throw UnsupportedOperationException()
    override val keys: Set<String>
        get() = throw UnsupportedOperationException()
    override val size: Int
        get() = throw UnsupportedOperationException()
    override val values: Collection<Any?>
        get() = throw UnsupportedOperationException()

    override fun containsKey(key: String): Boolean {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun containsValue(value: Any?): Boolean {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun get(key: String): Any? {
        return when (key) {
            "firstName" -> firstName
            "lastName" -> lastName
            "email" -> email
            else -> ""
            }
    }

    override fun isEmpty() = false

    }
*/

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

infix fun String.til(value: Any?) = Pair(this, value)

val pair1 = "xyz".til(56)
val pair2 = "xyz" til 56














