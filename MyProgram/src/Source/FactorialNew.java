package Source;

import java.util.Scanner;

public class FactorialNew {
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
System.out.println("entre the no for find factorial");
	  int num = sc.nextInt();
	  int result= factorial(num);
System.out.println("the factorial no of "+num+ " is "+result);
	   }

	   public static int factorial(int n) {
	       if (n == 0) {
	           return 1;
	       } else {
	           return n * factorial(n - 1);
	       }
	   }
}
