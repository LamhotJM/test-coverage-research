package com.lamhot.app;

public class Factorial {

	public long calculate(int num) {
		if (num < 0)
			return -1;

		if (num == 0) {
			return 1;
		} else {
			return (num * calculate(num- 1));
		}
	}
}