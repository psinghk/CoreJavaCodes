package basic;

import java.util.Scanner;

public class FactNo {

	public static void main(String[] args) 
	{
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the no find factorial: ");
     
      int n = sc.nextInt();
      //int result=calc(n);
      System.out.println("the factorial of " + n + " is "+ FactNo.calc(n));
	}
  public static  int calc(int n )
  {
	  if (n>0){
		  return (n*calc(n-1));
	          }
	  else
	  {
		  return 1;
	  }
	
	
  }
	
	
	
	
	
	
	
	
	
	
}
