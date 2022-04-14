package com.lamhot.app.practice;

public class PolindromString {

	public static void main(String[] argrs) {
		String sample = "Lamhot";

		PolindromString ob = new PolindromString();
		System.out.print(ob.prolindrom2(sample));
	}

	private Boolean polindrom(String input) {
		StringBuilder sb = new StringBuilder();
		String result = sb.toString();
		char temp;
		for (int i = input.length() - 1; i >= 0; i--) {
			temp = input.charAt(i);
			sb.append(temp);
		}

		result = sb.toString();
		return input.equals(result);

	}
	
	public Boolean prolindrom2(String input)
	{
		int i =0;
		int j = input.length()-1;
		while(i < j)
		{
			if(input.charAt(i)!=input.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
