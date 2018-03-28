package coms.sgs.programPattern.test;

import java.util.Scanner;

public class PatternDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter rows to print Pattrn:");
    int rows = sc.nextInt();
     
    /*Draw pattern     
    1                 
    1 2 
    1 2 3 
    1 2 3 4 
    1 2 3 4 5
    close */
    
   /* for (int i = 1; i <=rows; i++) 
     {
    	  for (int j =1; j <=i; j++) 
    	  {
    	    System.out.print("*"+" ");
			//System.out.print(j+" ");
		  }
    	  System.out.println();
		
   	 }*/
    
     /*Draw Pattern
     * * * * * 
     * * * * 
     * * * 
     * * 
     *
     Close */
     
     /*for (int i = 1; i <=rows; i++) 
     {
    	 for (int j =rows; j>=i; j--) {
    		 System.out.print("*"+" ");
		}
		System.out.println();
	 }*/
    
     for (int i = 1; i <=rows; i++) 
     {
		for (int j =rows-1; j >=i; j--) 
		{
		 System.out.print(" ");	
		}
		for (int k =1; k <=i; k++) 
		{
			System.out.print("*"+"");
			
		}
		System.out.println();
	 }
    
	}

}
