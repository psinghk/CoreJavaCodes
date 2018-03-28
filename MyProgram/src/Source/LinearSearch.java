package Source;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       int[] a={25,56,5,6,48,45};
       Scanner sc= new Scanner(System.in);
       System.out.println("enter item for searhing");
       int n =sc.nextInt();
        int item= n;
        int flag=1;
        
        for (int i = 0; i < a.length; i++) 
        {
        	
        
			if(a[i]==item)
			{ 
				flag=0;
			
				System.out.println("the data are  avliable"
						+"  searching succesfully ");
			}
        }
			
			if(flag==1)
			{
				System.out.println("the data are not avliable"+ " searching unsecessfull");
			}
	}
}
				
		
         
        
	


