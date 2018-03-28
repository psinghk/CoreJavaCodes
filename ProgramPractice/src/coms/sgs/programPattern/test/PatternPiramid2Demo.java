package coms.sgs.programPattern.test;

import java.util.Scanner;

public class PatternPiramid2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The rows to print Daimond pattern:");
		int rows = sc.nextInt();
		System.out.println("Here Is Pattern:");
		for (int i = 1; i <=rows; i++) {

			for (int j = i; j < rows; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

		for (int i =rows; i >0; i--) {

			for (int j = i; j < rows; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
