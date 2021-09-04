package prep60.others;

public class Q60_6_ZigZag_Conversion {

	public String convert(String s, int nRows) {
		String[] helper = new String[nRows];
		for (int i = 0; i < nRows; i++) {
			helper[i] = "";
		}
		int row = 0;
		int delta = 1;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			helper[row] += c;
			if (row == nRows - 1) {
				delta = -1;
			} else if (row == 0) {
				delta = 1;
			}
			row = row + delta;
			row = Math.max(0, row);
		} // for
		String result = "";
		for (int i = 0; i < nRows && s.length() > 0; i++) {
			result += helper[i];
		}
		return result;
	}

}
