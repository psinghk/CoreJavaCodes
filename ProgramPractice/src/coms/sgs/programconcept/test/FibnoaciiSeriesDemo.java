package coms.sgs.programconcept.test;

import java.util.Scanner;

public class FibnoaciiSeriesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 System.out.println("Entere The No upto which Fibnoacii Series Print");
 
	  Scanner sc = new Scanner(System.in);
	  int term = sc.nextInt();
	  System.out.println("fibnaccio series Upto "+term+" ");
	   for (int i = 1; i <=term; i++) 
	   {
		    System.out.print(fib2(i) +" ");
		
	   }
	}
	 public static int fib1(int term) 
	 {
		 if(term==1 || term==2){
		  return 1;
		 }
		  int a=1, b=1, result=0;
		  System.out.println("vvvvv");
		  for (int i = 3; i <= term; i++){
			  result=a+b;
			  a=b;
			  b=result;
		  }
		    return result;
	 }
	 
	//with recursion function
	
	public static int fib2(int number) 
	 {
		 if(number==1 || number==2){
		  return 1;
		 }
		 return fib2(number-1)+fib2(number-2);
	}
	 
}
