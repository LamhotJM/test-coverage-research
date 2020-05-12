package com.lamhot.app;

public class Prob1389CreateTargetArrayintheGivenOrder {

	public int[] createTargetArray(int[] nums, int[] index) {

        int size = 0;
        int[] data = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (index[i] != size) {
                for (int j = size; j > index[i]; j--) {
                    data[j] = data[j - 1];
                }
            }
            data[index[i]] = nums[i];
            size++;
        }
        return data;
    }

}
