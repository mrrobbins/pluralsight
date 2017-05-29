package com.github.mrrobbins.pluralsight.kotlin.kotlin

import com.github.mrrobbins.pluralsight.kotlin.java.Person


class Program {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val p = Person();
            p.name = "Matt"
            p.age = 21;

            println("${p.name} is ${p.age} years old")

            val partner = p.partner

            println(partner?.name)
        }
    }
}