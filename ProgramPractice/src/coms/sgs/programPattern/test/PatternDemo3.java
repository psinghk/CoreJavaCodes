package coms.sgs.programPattern.test;

import java.util.Scanner;

public class PatternDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the rows to print Pattren:");
		int rows = sc.nextInt();
		// This loop print up to half
		for (int i = 1; i <=rows; i++) 
		{
			for (int j = 1; j <=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();

		}
		// This loop print half of pattern
		for (int i = rows-1; i >=1; i--) 
		{
			for (int j = 1; j <=i; j++) {
				System.out.print(j+" ");


			}
			System.out.println();
		}

	}

}
