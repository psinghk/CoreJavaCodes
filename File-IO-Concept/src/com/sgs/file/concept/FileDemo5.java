package com.sgs.file.concept;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 // To Find  only all files in this location
		
		 File f = new File("G:\\my all java programs\\core java programs\\File-IO-Concept");
		 String[] s = f.list();
		 int count=0;
		 for (String s1 : s) {
			 
			  File f1 = new File(f,s1);
			  if(f1.isFile()){
				  count++;
				  System.out.println(f1);
			  }
			
		}
		  System.out.println("The total file is...  "+count);
	}

}
