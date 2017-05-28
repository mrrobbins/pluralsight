package com.github.mrrobbins.pluralsight.kotlin;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

/**
 * Created by mrobbins on 5/28/17.
 */
public class StringUtilsTest {

    @Test
    public void toUppercase() throws Exception {
        assertThat(StringUtils.toUppercase("bob"), equalTo("BOB"));
    }

}