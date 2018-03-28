package Com.sgs;

public class MyCheck3 {

	public static void main(String[] args) 
	{
		int[]A={21,52,26,21,47,7,5,42};
		for (int i = 0; i < A.length; i++) 
		{
			for (int j = i+1; j < A.length; j++) 
			{
				if(A[i]==A[j])
				{
					for (int j2 = 0; j2 < A.length-1; j2++) {
						A[j2]=A[j2+1];
					}
					
				}
			}
		}
		
		
		
		System.out.println("after deletion the arrays element is:");
		for (int i = 0; i < A.length-1; i++) 
		{
			System.out.print(A[i]+" ");
		}

	}

}
