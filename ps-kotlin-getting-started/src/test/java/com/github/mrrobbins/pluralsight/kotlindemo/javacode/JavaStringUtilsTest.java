package com.github.mrrobbins.pluralsight.kotlindemo.javacode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class JavaStringUtilsTest {

    @Test
    public void toUppercase() throws Exception {
        assertEquals("BOB", JavaStringUtils.toUpperCase("bob"));
    }

}