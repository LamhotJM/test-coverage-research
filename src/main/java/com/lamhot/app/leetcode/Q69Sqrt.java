package com.lamhot.app.leetcode;

public class Q69Sqrt {

	
	public static void main(String[] args)
	{
		
		Q69Sqrt ob = new Q69Sqrt();
		ob.intSqrt(10);
	}
	
	
	 public int intSqrt(int num) {
	        // write your awesome code here
	        if(num <=0 )
	        {
	            return 0;
	        }
	        
	        int start =1; 
	        int end = num;
	        int ans=0;
	        
	        while(start <= end)
	        {
	            int mid = start + (end - start)/2;
	            if (mid <= num/mid)
	            { 
	                ans = mid;
	                start= mid +1;
	            }
	            else{
	                end = mid-1;
	            }
	        }
	        
	        return ans;
	    }
	 
}
