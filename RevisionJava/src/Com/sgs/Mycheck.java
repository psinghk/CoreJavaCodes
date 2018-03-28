package Com.sgs;

import java.util.Scanner;

public class Mycheck {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre the string:");
	     String s = sc.nextLine();
	     String [] split =s.split(" ");
	      String p =split.toString();
	      String st = new String(p);
	     System.out.println(st);
		// String s1=s.concat("kumar").concat("gaurav");
		//System.out.println(s1);
		//String e=" ";
		
		//String s= new String("p");
		//System.out.println(e+s);
		//StringBuffer sb = new StringBuffer("TO");
		//sb.append("get").append("her");
		//System.out.println(sb.reverse());

	}

}
