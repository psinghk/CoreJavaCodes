package coms.sgs.programPattern.test;

import java.util.Scanner;

public class PatternDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the rosws to print:");
          int rows = sc.nextInt();
          for (int i = 1; i<=rows; i++) 
          {
        	for (int j=1; j< i; j++) 
        	 {
				System.out.print(" ");
			  } 
        	for (int k =i; k <=rows; k++) 
        	{
        		//System.out.print(k+"");
			  System.out.print(k+" ");	
			}
        	System.out.println();
			
		  }
          for (int i =rows; i >=1; i--) 
          {
			for (int j = 1; j < i; j++) 
			{
				System.out.print(" ");
				
			}
			for (int k = i; k <=rows; k++) 
			{
				System.out.print(k+" ");
				//System.out.print(k+"");
			}
			System.out.println();
		  }
          
          
   }

}
