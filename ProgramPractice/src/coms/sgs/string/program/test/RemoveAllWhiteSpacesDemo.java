package coms.sgs.string.program.test;

import java.util.Scanner;

public class RemoveAllWhiteSpacesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter The String to count of words");
		 String str = sc.nextLine();
		  int count=0;
		  for (int i = 0; i < str.length()-1; i++) 
		  {
			  if(str.charAt(i)==' '){
				 String s= str.replaceAll("\\s", "");
				 System.out.println(s);
				  count++;
			  }
			  //throw new RuntimeException(" spaces are not present");
			
		 }
		  System.out.println("The no of  remove spaces is   "+count);
		  
	}

}
