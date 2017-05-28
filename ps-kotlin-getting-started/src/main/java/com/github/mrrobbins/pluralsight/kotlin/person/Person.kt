package com.github.mrrobbins.pluralsight.kotlin.person


// an interface in file of another name!
interface Signatory {
    fun sign()
}

// add open keyword to allow downstream inheritance
open class Person(val name: String, val age: Int): Signatory {

    var gender = "unspecified";

    constructor(name: String, age: Int, gender: String) : this(name, age) {
        this.gender = gender
    }

    init {
        if (age > 19) throw Exception("$name is too old to be a teenager.")
    }

    override fun sign() = println("$name can sign documents, because he is $age.")
}

class Teenager(name: String, age: Int) : Person(name, age)

fun main(args: Array<String>) {
    val teenager = Teenager("Matt", 19)
    teenager.sign();
}