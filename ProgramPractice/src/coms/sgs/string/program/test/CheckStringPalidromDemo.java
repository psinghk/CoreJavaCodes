package coms.sgs.string.program.test;

import java.util.Scanner;

public class CheckStringPalidromDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String reverse = "";
     Scanner sc = new Scanner(System.in);
    // Class c = sc.getClass();
    // System.out.println(c);
     System.out.print("Enter the String to check palidrom or not  :");
      String Inputstring = sc.nextLine();
      int length = Inputstring.length();
      
      for (int i = length-1; i>=0 ; i--) 
		  reverse = reverse + Inputstring.charAt(i);
	
      
    
	if(Inputstring.equals(reverse))
  	  System.out.println(" Enter String is palidrom :");
    
    else
  	  System.out.println(" Enter String is not palidrom:");
    
		
	}	

}
