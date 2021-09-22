package com.sgtesting.string;

public class StrSplit {

	public static void main(String[] args)
	{
		{
			String s="Apple,Mango,Orange,Banana";
			String s1[]=s.split(",");
			for(String kk:s1)
			{
				System.out.println(kk);
			}
			System.out.println("++++++++++++");
		}
		

	}

}
