package com.lamhot.app.practice;

public class LongestCommonPrefix {
	//public static void main(String args[])
	public static void main(String args[]) {
		//TODO Auto-generated method stub
	    //longestCommonPrefix();
		String[] input = {"flower","flow", "flight"}; 
		LongestCommonPrefix fx = new LongestCommonPrefix();
		System.out.println(fx.longestCommonPrefix(input));

	}
	
	public String longestCommonPrefix(String[] str)
	{
		//String longestCommonPrefix="";
		StringBuilder longestCommonPrefix = new StringBuilder();
		if(str==null || str.length<0)
		{
			return longestCommonPrefix.toString();
		}
		int index =0; //
		for(Character c: str[0].toCharArray())
		{
			for(int i =1; i<str.length;i++)
			{
				if(index>= str[i].length()|| c!=str[i].charAt(index))
				{
					return longestCommonPrefix.toString();
				}
			}
			longestCommonPrefix.append(c);
			index ++;
		}
		return longestCommonPrefix.toString();
		
	}
	
	 public String longestCommonPrefix2(String[] strs) {
	        StringBuffer sb = new StringBuffer();
	        boolean prefixCheck = (strs.length > 0);
	        for (int j = 0; prefixCheck && j < strs[0].length(); j++) {
	            for (int i = 1; prefixCheck && i < strs.length; i++) {
	                if ((strs[i].length() <= j) || (strs[i].charAt(j) != strs[0].charAt(j)))
	                    prefixCheck = false;
	            }
	            if (prefixCheck) sb.append(strs[0].charAt(j));
	        }
	        System.out.println(sb.toString());
	        return sb.toString();
	    }

}
