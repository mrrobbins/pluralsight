package com.github.mrrobbins.pluralsight.kotlin;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

/**
 * Created by mrobbins on 5/28/17.
 */
public class JavaStringUtilsTest {

    @Test
    public void toUppercase() throws Exception {
        assertThat(JavaStringUtils.toUpperCase("bob"), equalTo("BOB"));
    }

}