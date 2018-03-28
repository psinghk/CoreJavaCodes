package coms.sgs.programconcept.test;

public class ArrayduplicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int[] a = {10,14,16,14,78,45,16,17,38};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j])
				{
				  System.out.println("Duplicate element is : " +a[j]);
					
				}
			}
		}
		
		
	}

}
