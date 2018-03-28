package coms.sgs.string.program.test;

import java.util.Scanner;

public class ContNoOfwordsStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String to count of words");
		String str = sc.nextLine();
		// String str = "kr gaurav";
		int count = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println("The No of Words in String is  " + count);

	}

}
