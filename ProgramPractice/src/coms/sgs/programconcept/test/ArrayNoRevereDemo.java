package coms.sgs.programconcept.test;

public class ArrayNoRevereDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		 //int[] a ={4,45,7,28,9,18};
		 String[] s ={"pk","lk","ln","lfg","mf"};
		 System.out.println("Array without reverse is ");

	       for (int i = 0; i < s.length; i++) {
				
				System.out.print(s[i]+" "); 
			}
		 System.out.println();
		 
		 int length = s.length;
		 System.out.println("After arrays  reverse:");
		 for (int i = length-1; i>=0;i-- ) {
			System.out.print(s[i]+" ");
		}
		 
	}
	
}
