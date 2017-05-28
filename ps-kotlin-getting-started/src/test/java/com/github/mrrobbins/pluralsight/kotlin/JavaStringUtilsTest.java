package com.github.mrrobbins.pluralsight.kotlin;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class JavaStringUtilsTest {

    @Test
    public void toUppercase() throws Exception {
        assertThat(JavaStringUtils.toUpperCase("bob"), equalTo("BOB"));
    }

}