package coms.sgs.programPattern.test;

import java.util.Scanner;

public class PatternDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter The rows to print pattern:");
		 int rows = sc.nextInt();
		 for (int i = rows; i >=1; i--) 
		 {
			 for (int j =rows; j >=i; j--){
			 System.out.print(j+" ");
				
			}
			 System.out.println();
			
		}
	}

}
