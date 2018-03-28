package coms.sgs.programconcept.test;

import java.util.Scanner;

public class ArraysearchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //System.out.println("vvvvvvvvvvvvvvvv");
		 int[] a={45,4,85,7,6,2,45,2};
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the element for search:");
		 int item = sc.nextInt();
		 
		 int flag=0;
		 
		 for (int i = 0; i < a.length; i++) 
		 {
			if(a[i]==item){
				flag=1;
				break;
			}
		}
		 if(flag==1){
			 System.out.println("seaching is succesfull: element is  "+item);
		 }
		 else{
			 System.out.println("Seaching is not succesfull:");
		 }
		 
	}

}
