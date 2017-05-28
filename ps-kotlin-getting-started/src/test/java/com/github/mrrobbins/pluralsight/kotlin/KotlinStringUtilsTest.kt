package com.github.mrrobbins.pluralsight.kotlin

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.*
import org.junit.Test

/**
 * Created by mrobbins on 5/28/17.
 */
class KotlinStringUtilsTest {

    @Test
    fun testToUpperCase() {
        assertThat(KotlinStringUtils().toUpperCase("bob"), equalTo("BOB"));
    }
}