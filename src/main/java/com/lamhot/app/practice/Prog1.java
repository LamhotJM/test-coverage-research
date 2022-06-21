package com.lamhot.app.practice;

import java.util.Arrays;

public class Prog1 {
	// input numeric

	// {-5,4,1,2,6}

	// 3
	// output {-2, 2, 3, 5, 11} , print total

	public static void main(String args[]) {

		Prog1 ob = new Prog1();
		int input[] = { -5, 4, 1, 2, 6 };
		// System.out.println(Arrays.toString(ob.calculate(input, 3)));
		ob.countKey("yybbcccyz");

	}

	private int[] calculate(int input[], int input2) {
		if (input == null || input.length <= 0) {
			return input;
		}
		int output[] = new int[input.length];

		output[0] = input2 + input[0];
		int sum = output[0];

		for (int i = 1; i < input.length; i++) {
			output[i] = input[i] + output[i - 1];
			sum += output[i];
		}

		System.out.println(sum);

		return output;

	}

	// input string : yybbcccyz
	// output: y2, b2, c3, y1, z1

	private void countKey(String input) {
		if (input == null || input.length() <= 0) {
			System.out.println(input);

		}

		int count = 1;
		for (int i = 0; i < input.length(); i++) {
			
			if (input.charAt(i) == input.charAt(i + 1)) {
				count++;
				
				continue;	
			}
			else {
				System.out.println(input.charAt(i));
				System.out.println(count);
			}
			count=1;

		}

	}

}
