//Write a program to print all Armstrong numbers under 1000
package com.Mysirg;

public class Test4 {

	public static void main(String[] args) 
	
	{ int c,i,a;
 
		for(int n= 1;n<=1000;n++)
		
		{  c=0;
			i=n;
			while(i>0)
			{
				a=i%10;
				i=i/10;
				c = c+a*a*a; 
				
			}
			if(n==c)
			{
				 System.out.println( " The  armstrong  no is:"+n+" ");
				
			}
			
			
			
		}
		
		
		
		
		
		
		

	}

}
