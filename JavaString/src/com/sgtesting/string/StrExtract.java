package com.sgtesting.string;

public class StrExtract {

	public static void main(String[] args)
	{

		String s="Programming";
		System.out.println("Extract 1:"+s.substring(3));
		System.out.println("Extract 2:"+s.substring(3,7));
		System.out.println("++++++++++++");
		
		
		String s1="Bangalore is a garden city";
		System.out.println("Starts With :"+s1.startsWith("Bangalore"));
		System.out.println("Ends With :"+s1.endsWith("city"));
		System.out.println("Contains :"+s1.contains("garden"));
		System.out.println("++++++++++++");
	}
	}


	


