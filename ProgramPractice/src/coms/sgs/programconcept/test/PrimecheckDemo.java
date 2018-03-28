package coms.sgs.programconcept.test;

import java.util.Scanner;

public class PrimecheckDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the No to check prime:");
      int n = sc.nextInt();
      boolean isprime = true;
       for (int i = 2; i < n; i++) 
       {
    	   if(n%i==0)
    	   {
    		   isprime = false;
    		   break;
    		   
    	   }
    	}
       if(isprime){
    	   System.out.println("The No is Prime: "+n);
       }
       else{
    	   System.out.println("The No is not prime "+n);
       }
		 
	}

}
