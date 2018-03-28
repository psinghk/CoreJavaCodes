package coms.sgs.programconcept.test;

import java.util.Scanner;

public class ArraySearchElementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
//		int[] a = new int[5];
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the array element:");
//		
//		for (int i = 0; i < a.length; i++) {
//			 a[i]=sc.nextInt(); 
//			 System.out.print("The array element is   "+a[i]+" ");
//		}
		int[] a = {10,45,48,12,17};
		
		 System.out.println("Enter the find Items:");
		 Scanner sc1 = new Scanner(System.in);
		  int fItem = sc1.nextInt();
		  int flag =1;
		  for (int j = 0; j < a.length; j++) {
			  if(a[j]==fItem){
				  System.out.println("serching is succesfull "+" element is "+a[j]);
				  flag=0;
				  
			     }
		  }     
		       if(flag==1)
				  System.out.println("seaching in not successful:");
		  
		}
		
		 
	

	
}
