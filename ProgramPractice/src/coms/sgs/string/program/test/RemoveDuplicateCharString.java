package coms.sgs.string.program.test;

import java.util.Scanner;

public class RemoveDuplicateCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Entre The String to Remove Duplicate:");
    String s = sc.nextLine();
    char[] c = s.toCharArray();
    int length = c.length;
    for (int i = 0; i < length-1; i++) {
		for (int j = i+1; j < length-1; j++) {
			if(c[i]==c[j])
			{
				int temp =j;
			    for (int k = temp; k < length-1; k++)
			    {
				        c[k]=c[k+1];
					
			    }
//			     j--;
//			     length--;
			
			 }
		}	
			
	}
    
    for (int l = 0; l < length-1; l++) {
		System.out.print(c[l]);
	}
//     String ws = new String(c);
//      ws = ws.substring(0, length);
//      System.out.println("Without Duplicates String is ");
//	  System.out.println(ws);
//    //System.out.println("After removing string is :");
   
	
	}
}
