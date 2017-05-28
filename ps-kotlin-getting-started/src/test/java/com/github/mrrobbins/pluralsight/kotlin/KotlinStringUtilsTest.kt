package com.github.mrrobbins.pluralsight.kotlin

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.*
import org.junit.Test

class KotlinStringUtilsTest {

    @Test
    fun testToUpperCase() {
        assertThat(KotlinStringUtils().toUpperCase("bob"), equalTo("BOB"));
    }
}