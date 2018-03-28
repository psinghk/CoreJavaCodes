package basic;

import java.util.Scanner;

public class LoopFactorial {
	  public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       System.out.print("Enter the number whose factorial is to be found: ");
	       int n = scanner.nextInt();
	       int result = factorial(n);
	       System.out.println("The factorial of " + n + " is " + result);
	   }

	   public static int factorial(int g ) 
	   {
	       int store = 1;
	       for (int i = 1; i <=g; i++) 
	       {
	           store = store * i;
	       }
	       return store;
	   }
}
