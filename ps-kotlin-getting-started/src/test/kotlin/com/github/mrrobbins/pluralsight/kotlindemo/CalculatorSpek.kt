package com.github.mrrobbins.pluralsight.kotlindemo

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.jupiter.api.Assertions.assertEquals


class CalculatorSpek : Spek({

    val calculator = Calculator(NullResult())

    describe("the calculator") {
        it("should add two numbers") {
            val result = calculator.add(12, 13)
            assertEquals(25, calculator.add(12, 13))
        }
    }

})