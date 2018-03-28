package Source;

//
public class InsertionSort 
   {
  
	public static void main(String[] args)
	{
		//System.out.println("THE  BEFORE SHORTED ELEMENT IS  :");
	 int A[]={15,9,36,45,29,11};
	 
	  Sort( A, 6);
	  
		
		  System.out.println("THE   SHORTED ELEMENT IS  :");
		  for(int i=0;i<=5;i++)
			  
		  { 
			  System.out.print("  "+ A[i]);
		  }
	  

	}
	public static void Sort(int A[],int N)
	{
		int temp;
		for(int i=1;i<N;i++)
		{
			temp=A[i];
			for(int j=i-1;j>=0 && temp<A[j];j--)	
			{
				A[j+1]=A[j];
				A[j]=temp;
			   
			}
		} 
}
   }
