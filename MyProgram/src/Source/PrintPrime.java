package Source;

//import java.util.Scanner;

public class PrintPrime {
	
public static void main(String[] args) 
{
	 int limit=20;
	//Scanner sc=new Scanner(System.in);
 
	   System.out.println(" THE  prime NO b/w  15 to  " + limit);
	    //int num=sc.nextInt();
	  for (int i = 1; i <=20; i++) 
	  {
		boolean isprime=true;
		
	 for (int j = 5; j <= i; j++)
	 {
		  if (i%j==0) 
		  {  System.out.println(i + " divisible by 5  ");
			   // isprime= false;
			  // break;
			   
			
		   }
	 }
	 
	    /*if (isprime) {
			System.out.println(i + " divisible by 5  ");
	    }
	   
	  }
}*/
}
}  
}
	   

