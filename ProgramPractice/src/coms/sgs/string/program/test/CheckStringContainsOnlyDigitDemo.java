package coms.sgs.string.program.test;

import java.util.Scanner;

public class CheckStringContainsOnlyDigitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Entre the String to check contains  digit or numbers ");
	  String str = sc.nextLine();
	  
	  //System.out.println("str "+" : "+str.matches("[0-9]+"));
	  
	  System.out.println("str is  "+" : "+str.matches("\\d+"));
	   //throw new RuntimeException("Contains Alphabaet Also");
	  
    /*
     * As per Java regular expressions, the  + means "one or more times" and \d means "a digit".

      Note: the "double backslash" is an escape sequence to get a single backslash - 
      therefore, \\d in a java String gives you the actual result: \d
     */
	  
	}

}
