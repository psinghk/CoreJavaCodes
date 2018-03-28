package coms.sgs.string.program.test;

import java.util.Scanner;

public class ConvertStringToIntgerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Entre The String :");
		Integer I = sc.nextInt();
		System.out.println("Converted String into Integer:");
		Integer Im =  Integer.valueOf(I);
		System.out.println(Im);
		//
		
	}

}
