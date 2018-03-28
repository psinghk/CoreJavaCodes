package com.sgs.file.concept;

import java.io.File;


public class FileDemo3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    // to display of all file and folder(Directory) to present in this below location
		 File f = new File("G:\\my all java programs\\core java programs");
	      String[] s = f.list();
	       int count=0;
	       for(String s1 :s){
	    	 count++;
	    	System.out.println(s1);
	       }
	        System.out.println(" Total no of file and folder in this current  Location is   :"+count);
		 
	}

}
