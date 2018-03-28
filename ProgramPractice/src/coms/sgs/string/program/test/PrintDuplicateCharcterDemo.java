package coms.sgs.string.program.test;

import java.util.Scanner;

public class PrintDuplicateCharcterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		 //String s = "prabhatbt";
		 //String se = "govind";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String to find the duplicate:");
		String s = sc.nextLine();
		 System.out.println(" Duplicate character is   ");
		 char[] c = s.toCharArray();
		 int count=0;
		 for (int i = 0; i < s.length(); i++) 
		 {
		 
			for (int j = i+1; j < s.length(); j++) 
			{
				if(c[i]==c[j]){
					System.out.print(""+c[j]+"  ");
					count++;
					
				}
				
			} 
			
			  
		 }
		 System.out.println();
		 System.out.println("Total duplicate charcter is  "+count);
		 
	}

}
