package Com.sgs;

import java.util.Scanner;

public class MyCheck2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] A= new int[7];
		int l =A.length;
		System.out.println("Entre the Arrays element:");
		for (int i = 0; i < A.length; i++) 
		{
			A[i]=sc.nextInt();
			
		}
		System.out.print("The Arrays element is before deletion");
		for (int i = 0; i < A.length; i++) 
		{
			System.out.print(A[i]+" ");
			
		}
		System.out.println();
		System.out.println("entre the specified index value:");
		int sp=sc.nextInt();
		for (int i = sp-1; i<l-1; i++) 
		{
			A[i]=A[i+1];
			
			
		}
		System.out.println("After deletion the Arrays element is:");
		for (int i = 0; i < A.length-1; i++) 
		{
			System.out.print(A[i]+" ");
		}
		

	}

}
