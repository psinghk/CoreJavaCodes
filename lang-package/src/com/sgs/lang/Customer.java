package com.sgs.lang;

public class Customer {
	public  String custName;
	public  int custId;


	public Customer(String custName, int custId) {

		this.custName = custName;
		this.custId = custId;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + custId;
		result = prime * result + ((custName == null) ? 0 : custName.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (custId != other.custId)
			return false;
		if (custName == null) {
			if (other.custName != null)
				return false;
		} else if (!custName.equals(other.custName))
			return false;
		return true;
	}



	public static void main(String[] args) {

		Customer c1 = new Customer("prabhat", 01);
		Customer c2 = new Customer("prabhat", 01);

		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode()+" 2 nd one  "+c2.hashCode());
		/*int a =10;
		  int b= 20;

		  System.out.println(a==b);
		  System.out.println(c1.equals(null));*/




		/*String s1 = new String("prabhat");
		  String s2 = "prabhat";
		  System.out.println(s1.equals(s2));*/


		/*String s ="prabhat";
		  System.out.println(s.hashCode());
		  s="ashish";
		  System.out.println(s.hashCode());
		  System.out.println(s);*/

		/*String s1 = new String("prabhat");
		  String s5 = s1.concat("prabhat");
		  System.out.println(s1);//prabhat
		  System.out.println(s5);*/// prabhat

		/*// The below object creation of string is runtime object creation
		  //which is allow in string class
		   String s2 = s1.concat("kumar");
		   System.out.println(s2);//prabhatumar
		   s1 = s1.concat("gaurav");
		   System.out.println(s1);//prabhatgaurav
		 */		  

		StringBuffer sb = new StringBuffer("prabhat");
		System.out.println(sb.capacity());
		String s = new String(sb);
		System.out.println(s);

		/*char [] ch ={'a','b','c','d'};
		  String s2  = new String(ch);
		  System.out.println(s2);*/


		/* System.out.println(s.equals("prabhat"));// equals() is for validate password
		  System.out.println(s.equalsIgnoreCase("PRABHAT"));*/// this method is used for username
		// because in userName caseSensetive is not an issues 

		StringBuffer sb1 = new StringBuffer("Abngh");
		sb.append("singh");
		System.out.println(sb1);


	}






}
