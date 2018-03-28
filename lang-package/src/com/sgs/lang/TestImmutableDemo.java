package com.sgs.lang;

public class TestImmutableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //String p = "prabhat"+"singh";
        
		User u = new User("Himanshu");
		String s7 = u+"mohan "+"singh";
		System.out.println(s7);
		System.out.println(s7.hashCode());
		User u3 = u.modifyUser("Himanshu");
		System.out.println(u3.hashCode());
		System.out.println(u.hashCode());

		User u1 = u.modifyUser("prabhat");
		System.out.println(u1);
		System.out.println(u1.hashCode());

		User u2 = u.modifyUser("govind");
		System.out.println(u2);
		System.out.println(u2.hashCode());
	}

}
