package com.lamhot.app;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
    
    public void testFib1()
    {
        assertEquals(1, fibonacci.fib(1));
    }

    /** Test fib(2). */
    @Test
    public void testFib2()
    {
        assertEquals(1, fibonacci.fib(2));
    }

    /** Test fib(3). */
    @Test
    public void testFib3()
    {
        assertEquals(2, fibonacci.fib(3));
    }

    /** Test fib(30). */
    @Test
    public void testFib30()
    {
        assertEquals(832040, fibonacci.fib(30));
    }

    /** Test fib(-1). */
    @Test
    public void testFibMinusOne()
    {
        boolean caught = false;
        try
        {
        	fibonacci.fib(-1);
        }
        catch (IllegalArgumentException e)
        {
            caught = true;
        }
        assertTrue(caught);
    }
}