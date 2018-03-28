package com.string;

import java.util.Scanner;

public class Count_Nwords {

	public static void main(String[] args) 

	{
		 System.out.println("Entre the String 1");
	 Scanner sc = new Scanner(System.in);
	 
	  String s = sc.nextLine();
	  int len = s.length();
	   int count =1;
	   
	   for (int i = 0; i < len-1; i++) 
	    {
		   if((s.charAt(i)==' ') &&(s.charAt(i+1)!=' '))
		   {
			count++;
		   }
			   
		
	   }
	   System.out.println("The no of words  In a String:"+count);
	 

	}

}
