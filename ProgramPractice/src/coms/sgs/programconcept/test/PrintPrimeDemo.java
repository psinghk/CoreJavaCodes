package coms.sgs.programconcept.test;

public class PrintPrimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int limit =20;
     System.out.println("The prime No b/w 1 to "+limit+" "+"is" );
     for (int i = 1; i <=limit; i++) 
     {
	   boolean isprime = true;
	    for (int j = 2; j < i; j++) {
			if(i%j==0){
				isprime = false;
				break;
			}
		}
	     if(isprime)
	    	 System.out.println(" "+i);
	    	 
	     
	   
	}
	}

}
