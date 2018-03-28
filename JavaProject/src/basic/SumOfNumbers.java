package basic;
import java.util.*;
public class SumOfNumbers {

	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 System.out.print("Enter value of n: ");
	 int n = input.nextInt();
	 long sum = 0;
	 for (int i = 1; i <= n; i++) {
	 //sum += i;
		 sum= sum+i;
	 }
	 System.out.println("Sum of Numbers from 1 to " + n + " : " + sum);
	 }
	}
	
	
	

