package coms.sgs.programPattern.test;

import java.util.Scanner;

public class PrintFloyadPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the rows to print floyad Tringle:");
      int rows = sc.nextInt();
      System.out.println("Here is floyad Tringle:");
       
        int num = 1;
        for (int i = 1; i <=rows; i++) 
        {
        	for (int j = 1; j <=i; j++) 
        	{
			  System.out.print(num+"\t");
			  num++;
			}
        	System.out.println();
        	
			
		}
       
	}

}
