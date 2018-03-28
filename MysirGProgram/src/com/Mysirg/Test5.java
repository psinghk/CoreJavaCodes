//Write a program to check Co-prime number
 //Co-prime No - Two number which which have not common factor of both 
 // num except 1;

package com.Mysirg;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) 
	{  
		int min,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first  no");
		int a = sc.nextInt();
		
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter the second  no");
		int b = sc1.nextInt();
		 min = a<b?a:b;// Assign min value b/w a and b
		 
		 for(i=2 ;i<=min;i++)
		 
		 {
		  if(a%i==0 && b%i==0)
			  break;
			 
		 }
		if(i==min+1)// here if loop fail then i value becomes min +1;
		{
			System.out.println("both no Are co-prime   "+a+", "+b);
		}
		else{
			System.out.println("both no are Not co-prime  "+a+" ,"+b);
		}
	}

}
