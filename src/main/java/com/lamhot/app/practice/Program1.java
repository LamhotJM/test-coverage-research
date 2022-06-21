package com.lamhot.app.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Program1 {
	//Infostretch
	public static void main(String args[])
	
	{
		
		Program1 ob = new Program1();
		
		System.out.println(ob.occur("Aaabbbccaa"));
		System.out.println("test");
		
	}
	
	public Set<Entry<Character, Integer>> occur(String input)
	{
		if( input==null | input.length()==0)
		{
			return null;
		}
		
	//	ArrayList<Character> arr = new ArrayList();
	 HashMap <Character, Integer> hm = new HashMap<Character, Integer>();
		
		Character temp;
	
		for(int i=0; i< input.length(); i++)
		{
			temp = input.charAt(i);
			
			if(hm.containsKey(input.charAt(i)))
			{
				int val = hm.get(input.charAt(i));
				hm.put(input.charAt(i),val+1 );
			}
			else {
				hm.put(temp, 1);
		}
			
			
		}
		
		return hm.entrySet();
	}

}
