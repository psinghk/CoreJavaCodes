package Com.sgs;

import java.util.Scanner;

public class Check_Prime {

	public static void main(String[] args) 
	{
		 boolean isprime;
		 
     Scanner  sc = new Scanner(System.in);
     System.out.println("Enter the No To check Prime:");
      int n = sc .nextInt();
      
       isprime = true;
        for (int i = 2; i <n; i++) 
        {
        	if(n%i==0)
        	{
        		isprime = false;
        		break;
        	}
			
		}
        if(isprime)
        	System.out.println(n +":  It is prime No: ");
        else
        	System.out.println(n+":  It is Not Prome No:");

	}

}
