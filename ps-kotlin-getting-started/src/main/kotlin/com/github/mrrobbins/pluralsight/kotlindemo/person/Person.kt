package com.github.mrrobbins.pluralsight.kotlindemo.person


// an interface in file of another name!
interface Signatory {
    fun sign()
}

// add open keyword to allow downstream inheritance
open class Person(val name: String, val age: Int, gender: String = "unspecified"): Signatory {

    var lastName: String = ""

    init {
        if (age > 19) throw Exception("$name is too old to be a teenager.")
    }

    override fun sign() = println("$name can sign documents, because he is $age.")

    companion object {
        @JvmStatic // need more than name `com.github.mrrobbins.pluralsight.kotlindemo.main` to make visible as com.github.mrrobbins.pluralsight.kotlindemo.main method to the jvm
        fun main(args: Array<String>) {
            val teenager = Teenager("Matt", 19)
            teenager.sign();
        }
    }
}

class Teenager(name: String, age: Int) : Person(name, age)

data class User(val name: String, val id: Int);

fun main(args: Array<String>) {
    println("Basic classes and inheritance examples:")
    val teenager = Teenager("Matt", 19)
    teenager.sign();

    println("Data class examples:")
    val robin = User("Robin", 1);

    println(robin);

    val (name) = robin;

    println("User is $name")

    val otherUser = robin.copy(id = 2)

    println(otherUser)
}