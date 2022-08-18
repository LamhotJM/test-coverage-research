package com.lamhot.app.practice;

public class Prob1 {
	
	public static void main(String args[])
	{
		/*/
		 * Write a program to extract the substring which starts with QA and ends with Scope
		 * [1:28 PM] S Preetham
		 * String i= " We are QA Automation Engineers with high scope on API automation"
		 * Expected Output = "QA Automation Engineers with high scope"
		 */
		
		Prob1 ob = new Prob1 ();
		String test1 = "We are QA Automation Engineers with high scope on API automation";
		System.out.println(ob.extractSubString(test1));


	}
	
	public String extractSubString(String input)
	{
		StringBuilder sb = new StringBuilder();
		String temp = "scope";
//		for(int i=0; i< input.length()-1; i++)
//		{
//			if(input.charAt(i)=='Q' && input.charAt(i+1)=='A')
//			{ 
////				for(int x=0; x< temp.length()-1;x++)
////				{
////				         	
////				}
//			   sb.append(input.charAt(i));
//			}
//			
//			
//			
//		}
		String [] elements = input.split(" ");
//		for(int i=0; i< elements.length; i++)
//		{
//			if(elements[i].equals("QA"))
//			{
//
//			
//					sb.append(elements[i]);
//				     while(!elements[i+1].equals("scope"))
//					{
//						sb.append(elements[i]);
//					}
//					
//				
//			}
//		}
 
		String result = input.substring(input.indexOf("QA") , input.indexOf("scope")+5);
		
		return result;
	}
	
}
