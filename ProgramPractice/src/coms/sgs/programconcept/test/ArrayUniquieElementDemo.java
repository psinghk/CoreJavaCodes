package coms.sgs.programconcept.test;

public class ArrayUniquieElementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] a = {4,4,4,10,4,4,4};
      for (int i = 0; i < a.length; i++) {
		
    	    if(a[i]!=a[i+1]){
    	    	System.out.println(" The unique Array element is : "+a[i+1]+"");
    	    	break;
    	    }
	  }
      
		 
	}

}
