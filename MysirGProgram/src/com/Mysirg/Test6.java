package com.Mysirg;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) 
	{
     Scanner sc = new Scanner(System.in);
     System.out.println("Entre the value to calculate radius ");
      int r = sc.nextInt();
     
       System.out.println("the area of cricle is:" + Area(r));
       
    		 
		
		
		
	}
    public static double Area(int r)
    {  
    	
    	double Calc;
    
    	Calc= 3.14*r*r;
    	 
		
    	return Calc;
    	
    }
    
}
