package Source;

import java.util.Scanner;

public class CheckPime {
	
	 public static void main(String[] args) 
	 {
		 boolean isprime= true;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the no for check ");
		 int n = sc.nextInt();
		  
		  for (int i = 2; i < n ; i++) 
		{
		  if (n%i==0) 
		  {
			 isprime = false;
			break;
			
		  }	
		}
		 if (isprime) {
			System.out.println(n + "  is  a prime");
		}
		  else {
			  System.out.println(n + "   is  not prime");
		}
		 
		 
				 
		  
		  
		  
	}

}
