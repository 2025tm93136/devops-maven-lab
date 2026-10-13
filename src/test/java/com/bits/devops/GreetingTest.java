package com.bits.devops;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GreetingTest {
    @Test
    public void messageIncludesName() {
        assertEquals("Hello BITS from BITS DevOps Lab", Greeting.message("BITS"));
    }

    @Test
    public void addsNumbers() {
        assertEquals(5, Greeting.add(2, 3));
    }
}
