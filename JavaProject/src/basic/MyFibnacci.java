package basic;

import java.util.Scanner;

public class MyFibnacci {
	public static void main(String[] args) {
	       Scanner Scanner = new Scanner(System.in);
	       System.out.print("Enter the number to find fibnoaci sereis  ");
	       int n = Scanner.nextInt();
	      long result = fib(n);
	       System.out.println("The fibnoacii of " + n + " is " + result);
          //for(int i=0 ;i<n; i++){
        	  //System.out.print(fib(i)+"  ");
         // }
	}
	public static int fib(int g)
	{
		if(g==0)
		{
			return 0;
		}
	      if(g==1)
		{
			return 1;
		}
		else
		{
			return fib(g-1)+fib(g-2);
		}
	}
	
}


