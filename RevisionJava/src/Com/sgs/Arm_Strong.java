package Com.sgs;

import java.util.Scanner;

public class Arm_Strong {

	public static void main(String[] args)
	{   int c=0;
	 int a;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the No to check AremStrong:");
		  int n = sc.nextInt();
		   int temp = n;
		
          while(n>0)
          {
        	a= n%10;
        	n= n/10;
        	c= c+a*a*a;
        	  
          }
           if(temp==c)
           {
        	   System.out.println("The No is Armstrong:  "+temp);
           }
           else
           {
        	   System.out.println("The No is not Armstrong: "+temp);
           }
	}

}
