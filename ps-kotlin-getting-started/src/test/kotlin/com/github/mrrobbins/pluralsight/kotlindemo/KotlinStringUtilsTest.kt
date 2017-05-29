package com.github.mrrobbins.pluralsight.kotlindemo

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class KotlinStringUtilsTest {

    @Test
    fun testToUpperCase() {
        assertEquals("BOB", KotlinStringUtils().toUpperCase("bob"))
    }
}