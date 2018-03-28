package Com.sgs;

import java.util.Scanner;

public class Print_Prime {
     
	public static void main(String[] args)
	{ 
		boolean isprime;
		
	 Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the Limit To print Prime:"); 
	   int Limit = sc.nextInt();
	  
	   System.out.println("The prime No b/w 1 to "+Limit+" is:" );
	   for (int i = 1; i <=Limit; i++)
	   {  
	         isprime = true;
	   
		   for (int j = 2; j <i; j++) 
		   {
			    if(i%j==0)
			    {
			    
			    	isprime = false;
			    	break;
			    }
			 
		   } 
		  
		 if(isprime)
		  {
			System.out.print(i+" " ); 
			
		 }
     }
 	 

	}

}
