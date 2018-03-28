package coms.sgs.programconcept.test;

import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter The No To find Fcatorial:");
     int n =sc.nextInt();
     int result = fact(n);
     System.out.println("The Fcatorial No of  "+n+" is.... "+result);
		
	}
	
	 /*public static int fact(int n)
	 {
		 int result =1;0
		 
		 if(n==1 || n==2)
			 return 1;
		 
	    else
		 {
			 for (int j = 1; j <=n; j++)
			 {
				result = result*j;
			 }
		 }
		  return result;
	 }*/
  
	 // By Using Recursion
	 public static int fact(int n)
	 {
		 if(n==0||n==1)
			 return 1;
		 else{
			 return (n* fact(n-1));
		 }
		 
	 }
}
