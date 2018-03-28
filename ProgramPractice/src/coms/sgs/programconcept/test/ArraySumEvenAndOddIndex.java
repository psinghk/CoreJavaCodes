package coms.sgs.programconcept.test;

public class ArraySumEvenAndOddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          long eIndexSum=0;
          long oIndexSum =0;
		 int[] a = {6,8,6,5,8};
		  System.out.println("The Array element is ");
		  for (int i = 0; i < a.length; i++) {
		  System.out.print(a[i]+" ");	
		}
		  System.out.println();
		 for (int j = 1; j < a.length; j++) {
			if(j%2==0)
			{
			 eIndexSum = eIndexSum+a[j];	
			}
			else{
				oIndexSum = oIndexSum+a[j];
			}
		}
		 long addall = oIndexSum+a[0];
		 System.out.println("The sum of Even Index is  "+eIndexSum);
		  System.out.println("The sum of Odd Index is  "+addall);
	}

}
