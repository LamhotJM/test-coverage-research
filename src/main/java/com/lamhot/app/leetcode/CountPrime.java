package com.lamhot.app.leetcode;

public class CountPrime {

	public static void main(String[] args) {
		CountPrime ob = new CountPrime();
		System.out.print(ob.countPrimes(10000));

	}

	public int countPrimes(int n) {
		if (n <= 1 || n == 2) {
			return 0;
		}
		if (n == 3)
			return 1;

		int count = 0;

		for (int i = 2; i < n; i++) {
			if (isPrime(i))
				count++;
		}

		return count;
	} 

	public boolean isPrime(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if ((num % i) == 0)
				return false;
		}

		return true;
	}

}
