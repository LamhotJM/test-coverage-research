package com.lamhot.app;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    private Fibonacci fibonacci;

    @Before
    public void setUp() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void calculate_0() {
        int input = 10;
        int expectedResult = 55;

        assertEquals(expectedResult, fibonacci.fib(input));
    }
}