package basic;

import java.util.Scanner;

public class ReverseNo {

	 public static void main(String[] args) {
	      Scanner s = new Scanner(System.in);
	       System.out.print("Enter the number to be reversed : ");
	       int input = s.nextInt();
	       int re = reverse(input);
	       System.out.println("The reversed number is " + re);
	   }

	  public static int reverse(int n) {
	       int result = 0;
	       int rem;
	      
	       while (n > 0) {
	           rem = n % 10;
	           n = n / 10;
	           result = result * 10 + rem;
	       }
	      return result;
	   }
}
