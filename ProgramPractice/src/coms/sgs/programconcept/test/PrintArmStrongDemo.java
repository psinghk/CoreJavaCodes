package coms.sgs.programconcept.test;

import java.util.Scanner;

public class PrintArmStrongDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The limit To Print armstrong:");
		int limit = sc.nextInt();
		int result = 0, a, rem;
		int newValue = 0;
		int temp;
		// for (int i = 1; i <=limit; i++)
	 int i =0;
			result = newValue;
			temp = i;
			while (i > 0) {
				a = i / 10;
				rem = i % 10;
				i = a;
				result = result + (rem * rem * rem);
		
			if (result == temp) {
				System.out.println("the armstrong no is  " + result);
			}
		}
	}

}
