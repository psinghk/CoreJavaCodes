package coms.sgs.string.program.test;

import java.util.Scanner;

public class CountVowelsAndConsonentInstringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String to count vowels and consonent::");
		String s = sc.nextLine();
		String vowels="aeiou";
		char [] c = s.toCharArray();
		char[] cv = vowels.toCharArray();
		int vCount=0;
		int Ccount =0;
		int flag = 0;
		
		for (int i = 0; i < c.length; i++) 
		{
			flag=0;
			for (int j = 0; j < cv.length; j++) 
			{
			
				 if (cv[j]==c[i]) {
					vCount++;
					flag=1;
				}
				 
			}
			if(flag==0)
				Ccount++;
			
			
		}
		
		//int cx = Ccount -1;
		System.out.print("The Total no of vowels in string is  "+vCount);
		System.out.println();
		System.out.print("The Total no of consonent in string is  "+Ccount);
	}
	

}
