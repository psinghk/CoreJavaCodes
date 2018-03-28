package coms.sgs.programconcept.test;

import java.util.Scanner;

public class ArrayDeleteElementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] a = {10,45,78,21,48,89,45,68,96};
		 System.out.println("Array Element Before deletion:");
		 for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		  System.out.println();
		  
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the specific index for delete elemnet:");
		 int postion= sc.nextInt();
		 int index = postion-1;
		 for (int i = index; i < a.length-1; i++) {
			a[i]=a[i+1];
		}
		System.out.println("Array element after deletion:"); 
		for (int j = 0; j < a.length-1; j++) {
			System.out.print(a[j]+" ");
		}
	}

}
