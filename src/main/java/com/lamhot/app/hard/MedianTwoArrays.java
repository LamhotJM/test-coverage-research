package com.lamhot.app.hard;

class MedianTwoArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int n = nums1.length;
		int n1 = nums2.length;
		int temp[] = new int[n + n1];
		double median = 0.0;
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] < nums2[j]) {
				temp[k] = nums1[i];
				i++;
			} else {
				temp[k] = nums2[j];
				j++;
			}
			k++;
		}

		while (i < nums1.length) {
			temp[k] = nums1[i];
			i++;
			k++;
		}
		while (j < nums2.length) {
			temp[k] = nums2[j];
			j++;
			k++;
		}

		if (temp.length % 2 != 0) {
			int mid = temp.length / 2;
			median = temp[mid];
		} else {
			int mid = temp.length / 2;
			median = (double) (temp[mid] + temp[mid - 1]) / 2;
		}

		return median;

	}
}
