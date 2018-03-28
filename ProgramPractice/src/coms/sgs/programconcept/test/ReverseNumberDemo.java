package coms.sgs.programconcept.test;

import java.util.Scanner;

public class ReverseNumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter The No For Reverse:");
		 int n = sc.nextInt();
		 int rNo = reverseNo(n); 
		 System.out.println("The Reverse No is  "+rNo);
		 
	}
	 public static int reverseNo(int n){
		 int rem,a, result=0;
		 while(n>0){
//			a =n/10;
//			rem =n%10;
//			n=a;
//			result = result*10+rem;
			 rem=n%10;
			 n=n/10;
			 result =result*10+rem;
		}
		 return result;
	 }

}
