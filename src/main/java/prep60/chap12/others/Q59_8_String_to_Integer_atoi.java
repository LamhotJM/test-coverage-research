package prep60.chap12.others;

public class Q59_8_String_to_Integer_atoi {

//8. String to Integer (atoi)

	public int myAtoi(String str) {
		if (str.length() == 0 || str == null)
			return 0;
		str = str.trim();
		if (str.equals(""))
			return 0;
		int idx = 0, sign = 1;
		long sum = 0;
		char firstChar = str.charAt(0);
		if (firstChar == '+') {
			sign = 1;
			idx++;
		} else if (firstChar == '-') {
			sign = -1;
			idx++;
		}
		while (idx < str.length()) {
			if (!Character.isDigit(str.charAt(idx)))
				return (int) sum * sign;
			sum = sum * 10 + str.charAt(idx) - '0';
			if (sign == 1 && sum > Integer.MAX_VALUE)
				return Integer.MAX_VALUE;
			if (sign == -1 && sum * sign < Integer.MIN_VALUE)
				return Integer.MIN_VALUE;
			idx++;
		}
		return (int) sum * sign;
	}

}
