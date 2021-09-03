package prep60.recursion;

public class Q45_50_Pow {
	/*
	 * 50. Pow(x, n)
	 * 
	 * Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

	Example 1:
	
	Input: x = 2.00000, n = 10
	Output: 1024.00000
	Example 2:
	
	Input: x = 2.10000, n = 3
	Output: 9.26100
	Example 3:
	
	Input: x = 2.00000, n = -2
	Output: 0.25000
	Explanation: 2-2 = 1/22 = 1/4 = 0.25
	 */
	
	public static void main(String args[])
	{
		Q45_50_Pow ob = new Q45_50_Pow();
		
		System.out.println(ob.myPow(2.00000, 10));
	}
	 public double myPow(double x, int n) {
			if (n == 0) {
				return 1;
			}
			if (n < 0) {
				if (n == Integer.MIN_VALUE) {
					n += 2;
				}
				n = -n;
				x = 1 / x;
			}

			return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);

		}

}
