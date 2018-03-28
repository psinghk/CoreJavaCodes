package com.sgs.file.concept;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileIODemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 File f = new File("abc1.txt");// This is java file object and its name is abc.txt
		                              // It is not present physically in our system
		                              //
		  System.out.println(f.exists());// that why its retuns false:
		  f.createNewFile(); // this line create phisycal file in our cwd.
		  System.out.println(f.exists());
		  FileWriter fw = new FileWriter("abc1.txt");
		 // fw.write(100);
		  char[] ch = {'a' ,'c' ,'d'};
		  fw.write("\n");
		  fw.write(" Hello prabat" );
		  fw.write(ch);
		  fw.flush();
		  fw.close();
		  
	}

}
