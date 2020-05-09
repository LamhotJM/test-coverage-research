package com.lamhot.app;

public class Fibonacci {
	
	
	public int fib(int N) {
		int curr = 0, next = 1;
		while (N-- > 0) {
			next = next + curr;
			curr = next - curr;
		}
		return curr;
	}

}
