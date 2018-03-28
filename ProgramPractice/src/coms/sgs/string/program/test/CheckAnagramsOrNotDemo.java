package coms.sgs.string.program.test;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagramsOrNotDemo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Entere First String : To check Anagrams or not:");
        String s1 = sc.nextLine();
        System.out.println("Entere Second String : To check Anagrams or not:");
        String s2 = sc.nextLine();
        isAnagram(s1, s2);
	}
	public static void isAnagram(String s1 , String s2){
		
		String str1 = s1.replaceAll("\\s", "");
		String str2 = s2.replaceAll("\\s", "");
		boolean status = true;
		
		 if (str1.length() != str1.length()){
			 status = false;
		 }
		 else{
			 char[] c1 = str1.toLowerCase().toCharArray();
			 char[] c2 = str2.toLowerCase().toCharArray();
			 
			 Arrays.sort(c1);
			 Arrays.sort(c2);
			 System.out.println(c1);
			 System.out.println(c2);
			 status = Arrays.equals(c1, c2);
		 }
		  if (status) {
			 System.out.println(str1 +" and " +str2 +"  Are anagrams");
		}
		  else{
			  System.out.println(str1 +"  and  " +str2+ " Are Not Anagrams  ");
		  }
			
		
	}

}
