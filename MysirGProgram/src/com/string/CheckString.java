package com.string;

import java.util.Scanner;

public class CheckString 
{

	public static void main(String[] args)
	
	{ // char p=' ';
		
		System.out.println("Enter the string.........");
	
	 
    Scanner sc = new Scanner(System.in);

    String s=sc.nextLine();
     String[] w= s.split("");
     String finalString ="";
     for (int i =w.length-1; i >=0; i--) 
     {
	  finalString = finalString + w[i]+" ";	
	  
	}
      System.out.println(finalString);
	}
}
      
     /* 
     char[] ch =s.toCharArray();
     int len = ch.length;

   // int count = 0;

    for (int i = 1; i < len; i++)
    {
    	 for (int j = 0; j <i; j++) 
    	 {
			if (ch[j]==ch[i])
			{          
				System.out.print(ch[j]+" ");
			}
		}
    }
     //System.out.println(" the repeate char is:"+p);
	}
}
        /*if(s.charAt(i) != ' ')
        {
            count++;
        }
    }

    System.out.println("Number of charcter in a string = "+count);

	}
	/* public static void main(String[] args)
	    {
	        String s = "Java is java again java again";
	 
	        char c = 'a';
	 
	        int count = s.length() - s.replace("a", "").length();
	 
	        System.out.println("Number of occurances of 'a' in "+s+" = "+count);
	    }*/


