package coms.sgs.programPattern.test;

import java.util.Scanner;

public class PatternPiramidDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter The rows to print Daimond pattern:");
		 int rows = sc.nextInt();
		 System.out.println("Here Is Pattern:");
		 int num=1;
		 
		 //This loop print Pyramid
		 
		 for (int i = rows; i >=1; i--) 
		 {
		   for (int j = 1; j < i; j++) 
		   {
			System.out.print(" ");
		  }	
		   for (int k = 1; k <=num; k++) 
		   {
			//System.out.print("*"+" ");
			   //System.out.print(k+" ");
			   //System.out.print(num+" ");
			   System.out.print("* ");
		   }
		   System.out.println();
		   num++;
		}
		  //including below loop then all are print Diamond
		  int num1 = rows-1;
		 for (int i = 1; i <=rows-1; i++) 
		 {
		   for (int j = 1; j <=i; j++) 
		   {
			System.out.print(" ");
		  }	
		   for (int k = 1; k <=num1; k++) 
		   {
			//System.out.print(num1+" ");
			System.out.print("* ");
		  }
		   System.out.println();
		   num1--;
		   
		 }  
	}

}
