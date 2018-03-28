package Source;

import java.util.Scanner;

//import java.util.Scanner;

public class PrintPrime1 {

	

	
	 public static void main(String [] args){
	// int n =30;
	  
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Limit for Print Prime");
	   int num=sc.nextInt();
	   System.out.println("Prime  no betwen 1 to  "+num);
	   for(int i=1;i<=num;i++)
	   {
           boolean isprime = true; 
	   
	    for(int j=2;j<i;j++)
		
		{
		 if(i%j==0){
		  isprime = false;
		  break;
		 }
		}
	    //System.out.println("The Prime no b/w 1 to  "+num);
		if(isprime)
		{
		 System.out.print(i+"  ");
		}
		
		
	   
	   
	 }

	
	
	
	
	
	
	
	 }
	
	
	
	
	
	
	
}
