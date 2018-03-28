package Source;

public class Selection {

	public static void main(String[] args) 
	{
		int temp,loc,k;
		int A[]={12,5,3,56,4,8};
		for(k=0;k<=4;k++)
		{
			loc=min(A,k,6);
			temp=A[k];
			A[k]=A[loc];
			A[loc]=temp;
		}
		System.out.println("The sorted no is :");
		for(int j=0;j<=5;j++)
		{
			
			System.out.print(" "+A[j]);
		}
		
	}
	public static int min(int A[],int k,int N)
	{
		int MIN,LOC;
		MIN=A[k];
		LOC=k;
		for(int p=k+1;p<=N-1;p++)
		
			if(MIN >A[p])
			{
				MIN=A[p];
			    LOC=p;
			}
		
		return(LOC);
		

	}

}
