package coms.sgs.programconcept.test;

import java.util.Scanner;

public class FindFactorOfNoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The No To find Fcator:");
    int number = sc.nextInt();
    
     System.out.println("Factor of  "+number+" "+"is");
     
      for (int i = 1; i <=number; i++) 
      {
		if(number%i==0)
		{
		  System.out.print(i+" ");	
		}
	  }
	}

}
