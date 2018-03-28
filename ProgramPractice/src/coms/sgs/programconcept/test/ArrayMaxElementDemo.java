package coms.sgs.programconcept.test;

public class ArrayMaxElementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] a = {445,4,8,79,99,4400};
      System.out.println("Array element is ");
      for (int i = 0; i < a.length; i++) 
      {
		System.out.print(a[i]+" ");
	  }
      System.out.println();
      int max = a[0];
       for (int j = 1; j < a.length; j++) 
       {
		//if(max < a[j])
    	   if(a[j]>max)
		{
		 max=a[j];
			
		}
		
	  }
       System.out.println("The Max elemenet is  "+max);
	}

}
