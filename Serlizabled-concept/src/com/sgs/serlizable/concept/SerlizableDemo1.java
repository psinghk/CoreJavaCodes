package com.sgs.serlizable.concept;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;



public class SerlizableDemo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		 Dog d1 = new Dog();
		 FileOutputStream fos = new FileOutputStream("ser.txt.");
		 ObjectOutputStream ois = new ObjectOutputStream(fos);
		  ois.writeObject(d1);
		  System.out.println(" thsi is ");
	}

}
