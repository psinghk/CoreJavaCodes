package coms.sgs.programconcept.test;

import java.util.Scanner;

public class PerfectNoPrintDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int limit =9000;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Limit To Print perfect No:");
	int limit = sc.nextInt();
	System.out.println("The Perfect No b/w 1 to "+limit+" "+ "is" );
		int add =0 ,sum;
		int temp;
     for (int i =1 ; i <=limit; i++) 
     {
		 sum=add;// need to re-initilize  again again:
    	 temp=i;// need to re-initilize  again again:
		  for (int j = 1; j < i; j++) 
		  {
			  if(i%j==0)
			  {
				sum=sum+j;
				
			  }
			
		  }
		  if(sum==temp)
		    System.out.println("The Perfect No is   "+sum+" "); 
		 
	    }
		 
	}

}
