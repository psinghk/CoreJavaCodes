package Source;

public class Factorial {
	//int n=7;
	//int result = factorial(n);
	public static void main (String args[])
	{
		System.out.println("factorial no 5 is  "+ fact(5));
	}
	 public static int fact(int n)
	 {
		 if (n>1)
		      {
			 return(n*fact(n-1));
					
		     }
		 else{
			 return 1;
		     }
	 
	
	 }  

}
