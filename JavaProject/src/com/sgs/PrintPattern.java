package com.sgs;

public class PrintPattern {

	public static void main(String[] args) 
	{
		 int i,j,k;
		for(i=5;i>0;i--)
		{
			for(k=1;k<=5-i;k++)
			{
			  System.out.print(" ");	
			}
			
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
