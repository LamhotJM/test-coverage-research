package com.lamhot.app.practice;

class LongestCommonPrevix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        String previx = strs[0];
        for(int i =1; i< strs.length; i++)
        {
            while(strs[i].indexOf(previx) !=0)
            {
                previx = previx.substring(0, previx.length()-1);
                if(previx.isEmpty()) return "";
            }
        }
        return previx;
    }
    public static void main(String args[])
    {
    	LongestCommonPrevix ob = new LongestCommonPrevix();
    	String input [] = {"flower","flow","flight"};
    	System.out.println(ob.longestCommonPrefix(input));
    }
}