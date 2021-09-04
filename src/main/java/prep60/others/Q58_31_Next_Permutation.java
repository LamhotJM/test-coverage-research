package prep60.others;

public class Q58_31_Next_Permutation {

	public void nextPermutation(int[] nums) {
		int i = nums.length - 1;
		while (i > 0 && nums[i - 1] >= nums[i]) {
			--i;
		}

		if (i > 0) {
			int j = nums.length - 1;

			while (j >= i && nums[i - 1] >= nums[j]) {
				--j;
			}

			swap(nums, i - 1, j);
		}
		reverse(nums, i, nums.length - 1);
	}

	public void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public void reverse(int[] nums, int start, int end) {
		while (start < end) {
			swap(nums, start, end);
			++start;
			--end;
		}
	}

}
