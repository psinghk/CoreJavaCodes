package coms.sgs.programconcept.test;

public class ArrayElementSumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      long sum =0;
		 
		 int[] a = {41,45,4,78,45,7,56,85,78,48};
		 System.out.println("The Array element is :");
		 for (int j = 0; j < a.length; j++) {
			System.out.print(a[j]+" ");
		}
		  
		 System.out.println();
		 for (int i = 0; i < a.length; i++) {
			sum = sum+a[i];
		}
		  System.out.println("The sum of Array element is  "+sum);
		 
	}

}
