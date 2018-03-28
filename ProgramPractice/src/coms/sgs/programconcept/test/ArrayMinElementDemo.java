package coms.sgs.programconcept.test;

public class ArrayMinElementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {445,4,8,79,99,440};
	      System.out.println("Array element is ");
	      for (int i = 0; i < a.length; i++) 
	      {
			System.out.print(a[i]+" ");
		  }
	      System.out.println();
	      int min = a[0];
	       for (int j = 1; j < a.length; j++) 
	       {
			if(min > a[j])
			{
			 min=a[j];
				
			}
			
		  }
	       System.out.println("The Min elemenet is  "+min);
		
	}

}
