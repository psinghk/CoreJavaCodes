package com.sgs.test;

public class SortArray_Ele {

	public static void main(String[] args) 
	{
      int[] A={45,12,7,5,8};
      sort(A,5);
      System.out.println("The Element in Desending order:");
      for (int i = 0; i < A.length; i++) 
      {
		System.out.print(A[i]+" ");
	}
      
        

	}
     public static void sort(int[] A,int n)
     {
    	 int r,temp,i;
    	 for (r =1;  r< A.length-1; r++) 
    	 {
			
    		 for (int j = 0; j < A.length-1; j++) 
    		 {
				if(A[j] > A[j+1]){
					
					 temp=A[j];
					 A[j]=A[j+1];
					 A[j+1]=temp;
					 
				}
			}
		}
     }
	 
}
