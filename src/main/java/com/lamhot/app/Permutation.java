package com.lamhot.app;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	List<String> list = new ArrayList<String>();

	public List<String> permutation(String str) {
		if (str == null || str.length() <= 0)
			return null;
		permutation(str,"");
		return list;
	}

	private void permutation(String str, String ans) {

		if (str.length() == 0) {
			list.add(ans);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			String ros = str.substring(0, i) + str.substring(i + 1);
			permutation(ros, ans + ch);
		}
	}

}
