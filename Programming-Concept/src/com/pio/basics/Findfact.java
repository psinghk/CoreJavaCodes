package com.pio.basics;

import java.util.Scanner;

public class Findfact {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no find factorial");
		int num = sc.nextInt();
		System.out.println("the factorial of" + num + "is" + new Findfact().factorial(num));
	}

	public int factorial(int g) {
		int s = 1;
		for (int i = 1; i < g; i++) {
			s = s * i;
		}
		return s;
	}
}
/*
 * if (n>0){ return (n*factorial(n-1)); } else { return 1; } } }
 */
