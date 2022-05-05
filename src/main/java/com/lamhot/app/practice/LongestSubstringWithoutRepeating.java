package com.lamhot.app.practice;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {

	 public int lengthOfLongestSubstring(String s) {
	        
	        HashSet<Character> hs = new HashSet<Character>();
	        int pointerA=0;
	        int pointerB=0;
	        int max = 0;
	        
	        while(pointerB < s.length())
	        {
	            if(!hs.contains(s.charAt(pointerB)))
	            {
	                hs.add(s.charAt(pointerB));
	                pointerB++;
	                
	                max = Math.max(hs.size(), max);
	            }
	            else
	            {
	                hs.remove(s.charAt(pointerA));
	                pointerA++;
	                
	            }
	        }
	        
	        return max;
	    }

}
