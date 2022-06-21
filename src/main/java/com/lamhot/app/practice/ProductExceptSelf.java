package com.lamhot.app.practice;

import java.util.Arrays;

public class ProductExceptSelf {

	public static void main(String args[]) {
		ProductExceptSelf ob = new ProductExceptSelf();
		System.out.println(Arrays.toString(ob.productExceptSelf(new int[] { 1, 2, 3, 4 })));

	}

	public int[] productExceptSelf2(int[] nums) {

		int N = nums.length;
		int[] output_arr = new int[nums.length];

		output_arr[0] = 1;

		for (int i = 1; i < N; i++) {
			System.out.println("out " + output_arr[i - 1] + " * nums -> " + nums[i - 1]);
			output_arr[i] = nums[i - 1] * output_arr[i - 1];

			System.out.println("out " + Arrays.toString(output_arr));

		}

		int R = 1;
		for (int i = N - 1; i >= 0; i--) {
			System.out.println("R " + R + " -> Nums  " + nums[i] + " Output 2-> " + Arrays.toString(output_arr));
			output_arr[i] = output_arr[i] * R;

			//
			R = R * nums[i];

		}

		return output_arr;
	}

	public int[] productExceptSelf(int[] nums) {

		int output[] = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			int product = 1;
			for (int j = 0; j < nums.length; j++) {
				if (i != j)
					product *= nums[j];
			}

			output[i] = product;
		}

		return output;

	}

}
