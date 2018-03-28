package basic;

import java.util.Scanner;

public class FibonacciSeries {
	  public static void main(String[] args) {
	       Scanner s = new Scanner(System.in);
	       System.out.print("Enter the value of n: ");
	       int n = s.nextInt();
	       int g =0;
	       for ( g = 0;  g <n; g++) 
	       {
	           System.out.print(fibonacci(g) + " ");
	       }
	   }

	   public static int fibonacci(int n) {
	       if (n == 0) {
	          return 0;
	       } else if (n == 1) {
	         return 1;
	       } else {
	           return fibonacci(n - 1) + fibonacci(n - 2);
	       }
	   }
}
