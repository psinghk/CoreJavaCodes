package coms.sgs.string.program.test;

import java.util.Scanner;

public class ReverseStringWithPreservingSpacesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String Reverse with preseving spaces:");
		String s = sc.nextLine();
		resverseString(s);
	}

	public static void resverseString(String s) {
		char[] inputString = s.toCharArray();
		char[] copyString = new char[inputString.length];
		String[] x = s.split(" ");
		System.out.println(x);

		for (int i = 0; i < inputString.length; i++) {
			if (inputString[i] == ' ') {
				copyString[i] = ' ';
			}

		}
		int j = copyString.length - 1;

		for (int i = 0; i < inputString.length; i++) {
			if (inputString[i] != ' ') {
				if (copyString[j] == ' ') {
					j--;

				}
				copyString[j] = inputString[i];
				j--;
			}

		}
		System.out.println("The revesre string is -----> " + String.valueOf(copyString));
	}

}
