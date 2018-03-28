package coms.sgs.programPattern.test;

import java.util.Scanner;

public class PatternDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Entre The rows to print Pattern:");
      int rows = sc.nextInt();
      for (int i =rows; i >=1; i--) 
      {
	    for (int j = 1; j <=i; j++) 
	    {
	    	System.out.print(j+" ");
			
		}	
	    System.out.println();
	 }
       
      for (int i = 1; i <=rows; i++) 
      {
    	  for (int k = 1; k <=i; k++) {
			System.out.print(k+" ");
		}
    	  System.out.println();
		
	}
       
	}

}
