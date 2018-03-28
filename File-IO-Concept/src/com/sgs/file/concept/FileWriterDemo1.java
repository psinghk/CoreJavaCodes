package com.sgs.file.concept;

import java.io.FileWriter;


public class FileWriterDemo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    FileWriter fw = new FileWriter("Prabhat.txt1"); 
    fw.write("Govind Singh");
    fw.write("\n");
    fw.write(100);
    fw.flush();
    fw.close();
		
		 
		 
    
    
    
	}

}
