package com.lamhot.app;

public class StringReplace {

	public String strReplace(String input) {
		if (input == null || input.length() <= 0) {
			return input;
		}
		StringBuffer sb = new StringBuffer();
		if (input.contains("morning")) {
			sb.append("Hello good evening Lamhot");
		}

		return sb.toString();
	}

}
