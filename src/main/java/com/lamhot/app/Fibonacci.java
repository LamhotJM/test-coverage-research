package com.lamhot.app;

public class Fibonacci {
	public static void main(String args[])
	{
		Fibonacci ob = new Fibonacci();
		System.out.println(ob.fib(10));
		
	}
	
	
	public int fib(int n) {
		if (n < 0)
        {
            throw new IllegalArgumentException("n must be >= 0");
        }
		
		int curr = 0, next = 1;
		while (n-- > 0) {
			next = next + curr;
			curr = next - curr;
		}
		return curr;
	}

}
