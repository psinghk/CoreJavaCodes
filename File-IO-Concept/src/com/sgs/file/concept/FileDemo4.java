package com.sgs.file.concept;

import java.io.File;

public class FileDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File f = new File("G:\\my all java programs\\core java programs\\File-IO-Concept");
		 String[] s = f.list();
		 int count=0;
		 for (String s1 : s) {
			 
			  File f1 = new File(f,s1);
			  if(f1.isDirectory()){
				  count++;
				  System.out.println(f1);
			  }
			
		}
		  System.out.println("The total Directory is...  "+count);
	}

}
