package Com.sgs;

import java.util.Scanner;


public class Reverse_String {

	public static void main(String[] args) 
	{
		 
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the String:");
        String s= in.nextLine();
        String rs= reverse_S(s);
         System.out.println(rs);
       
	}
    public static String reverse_S(String s) 
    { String rev_R = " ";
        int ls = s.length();
		 //String Str = new String(s);
		 System.out.println("After Revers:");
		  for (int j = ls-1; j>=0; j--)
		  {
			  rev_R = rev_R +s.charAt(j);
		 }
		  return rev_R;
	}
}
