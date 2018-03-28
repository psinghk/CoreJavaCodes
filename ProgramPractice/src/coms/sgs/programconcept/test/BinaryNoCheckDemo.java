package coms.sgs.programconcept.test;

import java.util.Scanner;

public class BinaryNoCheckDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter The No to Check binary Or Not:");
      int binary = sc.nextInt();
         boolean status1 = isBinary(binary);
		 System.out.println("Is  "+binary+" binary No? == "+status1);
	}
	 public static boolean isBinary(int binary)
	 {
		  boolean status = true;
		 while(binary>0)
		 {
		   //int q=binary/10;	 
		   int temp = binary%10;	 
		     if(temp>1)
		     { 
		    	 status=false;
		    	 break;
		     }
		     binary = binary/10;
		     //binary=q;
		 
	     }
		 return status;
	 }
}
