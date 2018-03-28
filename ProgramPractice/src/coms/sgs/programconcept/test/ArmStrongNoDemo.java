package coms.sgs.programconcept.test;

import java.util.Scanner;



public class ArmStrongNoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter The No To check armstrong:");
		 int n = sc.nextInt();
		 checkArmstrong(n);
	}
		 
	public static void	checkArmstrong(int n)
	{ 
		int oNo = n;int result=0;int a,rem;
		 while(n>0)
		 {
			 a=n/10;
			 rem = n%10;
			 n=a;
			 result = result+(rem*rem*rem);
		  }
		 
		 if(oNo==result){
			 System.out.println("The number is Armstrong... "+oNo);
		 }
		 else{
			 System.out.println("The No is Not Armstrong .... "+oNo);
		 }
	}
	 

}
