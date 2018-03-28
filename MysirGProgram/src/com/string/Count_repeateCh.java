package com.string;

import java.util.Scanner;

public class Count_repeateCh {

	public static void main(String[] args) 
	{
		 int count =0;
		 System.out.println("Entre the string to count char"); 
	     Scanner sc = new Scanner(System.in);
	     String s = sc.nextLine();
	     int len = s.length();
	     System.out.println();
	     String spc = sc.nextLine();
	     //char[]  c = spc.toCharArray();
	     char c='a';
	     //char a = sc.
	      for (int i = 0; i < len; i++) 
	      
	      {
	    	  if(s.charAt(i)== c)
	    	  {
	    		  count++;
	    		  
	    	  }
			
	    	  
		  }
         System.out.println("The total No of repeted char  "+c+ "is"   +count);		
	}

}
