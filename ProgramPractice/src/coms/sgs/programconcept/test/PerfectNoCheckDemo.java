// perfect no is all factor of that no . after adding the all factor
//the sum of all factor is equal to that no
// and here we not consider the last factor of this no ex 28 ka 28 not adding
//ex -28 factor is 1,2,4,7,14 we addition of no is 28 here
// ex -6 it fcator is 1,2,3 we not add 6
// some perfect no is --6,28,496,8128 etc
package coms.sgs.programconcept.test;

import java.util.Scanner;

public class PerfectNoCheckDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Number to check Perfect or Not: ");
      int n = sc.nextInt();
       for (int i = 1; i < n; i++) 
       { 
    	   
    	  if(n%i==0)
		  sum = sum+i;
	   }
        if(sum==n){
        	System.out.println("The Number is Perfect...  "+sum);
        }
        else
        	System.out.println("The Number IS Not PERFECT:..  "+n);
     
	}

}
