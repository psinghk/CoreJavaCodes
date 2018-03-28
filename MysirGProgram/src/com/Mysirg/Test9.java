//Program to find greatest among 3 using conditional operators
package com.Mysirg;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args)

	
	{ int max;
	  
		Scanner sc1 = new Scanner(System.in);
	     System.out.println(" enter the first no ");
			int n1 = sc1.nextInt();
	     Scanner sc2 = new Scanner(System.in);
		 System.out.println(" enter the second No");
				int n2 = sc2.nextInt();
	     Scanner sc3 = new Scanner(System.in);
		 System.out.println(" enter teh third No");
					int n3 = sc3.nextInt();

					int a= n1,b=n2,c=n3;
		
		
		 max = (a>b)? ((a>c)?a:c):((b>c)?b:c);
		  System.out.println("The grater No is :" +max);

}
}
