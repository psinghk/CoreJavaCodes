package Source;

import java.util.Scanner;

public class Aramstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int c=0,a,temp;  
		 Scanner in = new Scanner(System.in);
		 
	      System.out.println("Enter a string to check if it is a palindrome");
	      int n = in.nextInt();
	 
		    //int n=153;//It is the number to check armstrong  
		    temp=n;  
		    //while(n>0)
		   
		     while(n>0)	{ 
		      a=n%10;  
		      n=n/10;  
		      c=c+(a*a*a); 
		     }
		      
		      if(temp==c)  
			  System.out.println("armstrong number is :"+c); 
		      
		    else  
		        System.out.println("Not armstrong number");  
	}

}
