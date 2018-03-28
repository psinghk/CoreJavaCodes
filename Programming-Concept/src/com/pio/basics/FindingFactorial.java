package com.pio.basics;

import java.util.Scanner;

public class FindingFactorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no find factorial");
		int num = sc.nextInt();
		System.out.println("The factorial of  " + num + " is " + new FindingFactorial().factorialFind(num));
	}

	public int factorialFind(int n) {
		if (n > 0) {
			return (n * factorialFind(n - 1));
		} else {
			return 1;
		}

	}

}
