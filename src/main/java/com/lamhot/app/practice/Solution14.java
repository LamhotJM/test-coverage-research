package com.lamhot.app.practice;

class Solution14 {

	public static void main(String args[]) {
		Solution14 ob = new Solution14();
		String[] input = { "fl", "fl" };
		System.out.println(ob.longestCommonPrefix(input));
	}
    
	//verily
	public String longestCommonPrefix(String[] strs) {
		StringBuilder sb = new StringBuilder();
		if (strs.length <= 0 || strs == null) {
			return sb.toString();
		}
		int index = 0;

		for (Character c : strs[0].toCharArray()) {
			for (int i = 1; i < strs.length; i++) {
				if (index >= strs[i].length() || c != strs[i].charAt(index)) {
					return sb.toString();
				}
			}

			index++;
			sb.append(c);

		}

		return sb.toString();

	}
}