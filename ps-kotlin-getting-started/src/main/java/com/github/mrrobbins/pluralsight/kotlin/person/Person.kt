package com.github.mrrobbins.pluralsight.kotlin.person


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
        @JvmStatic // need more than name `main` to make visible as main method to the jvm
        fun main(args: Array<String>) {
            val teenager = Teenager("Matt", 19)
            teenager.sign();
        }
    }
}

class Teenager(name: String, age: Int) : Person(name, age)


fun main(args: Array<String>) {
    val teenager = Teenager("Matt", 19)
    teenager.sign();
}