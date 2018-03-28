
//Program to find greatest among 3 number using if-else
package com.Mysirg;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args)
	{
		
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
						if(a>b)
							
							{
							
							
							
						
						     if (a>c) 
							System.out.println("grater no is:"+a);
							
						
						     else
							System.out.println("grater no is:"+c);
							}
						else if(b>c)
						System.out.println("grater no is:"+b);
							
						
						else
						
							System.out.println("smaller no is:"+c);
						
							
							
							
						

					}


		
	}


