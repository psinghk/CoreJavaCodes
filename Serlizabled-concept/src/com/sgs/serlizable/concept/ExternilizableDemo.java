package com.sgs.serlizable.concept;

import java.io.Externalizable;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


public class ExternilizableDemo implements Externalizable {
	
	String s;
	int i;
	int j;
	
	
	public ExternilizableDemo() {
		
		 System.out.println("No -Arg constructor call");
	}

	 
    public ExternilizableDemo(String s, int i, int j) {
		
		this.s = s;
		this.i = i;
		this.j = j;
	}
    
    @Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("De-serlization call:");
    	 
		        s=(String)in.readObject();
		        i = in.readInt();
    	
	}


	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("serlization call:");
		out.writeObject(s);
		out.writeInt(i);
		
	}
    
   public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	    ExternilizableDemo t1  = new ExternilizableDemo("prabhat",20,12);
	    
	    FileOutputStream fos = new FileOutputStream("abc.txt");
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(t1);
	    
	    FileInputStream fis = new FileInputStream("abc.txt");
	    ObjectInputStream  ois = new ObjectInputStream(fis);
	    ExternilizableDemo t2 = (ExternilizableDemo)ois.readObject();
	     System.out.println(t2.s+"..."+t2.i+"..."+t2.j+"..");
	    
	}


	

}
