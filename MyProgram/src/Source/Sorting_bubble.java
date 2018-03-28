package Source;

 public class Sorting_bubble {
  public static void main(String[] args){
		int i;
		 int A[]={41,5,9,97,75,78,45,42,5,86};
		 {
			 sort(A,10);
			 for(i=0;i<=9;i++)
			 {
				 System.out.print(" " + A[i]);
				 
				 
			 }
		 } 
		 
		 
		 
	 }
	 public static void sort(int A[],int N)
	 {
	  int temp,round,flag,i;
	    for(round=1;round <=N-1;round++)
	    {
		  flag=0;
          for(i=0; i<=N-1-round; i++)		
          {
		    if(A[i]>A[i+1])
		     {
		       flag=1;
          	    temp=A[i];
          	     
                 A[i]=A[i+1];
			     A[i+1]=temp;
		     }
		  }
		      if(flag==0)
		      {
			 
		 
		       System.out.println("total no of round=" +round );
               return;
		  
		   
	          } 
		 
		  }
	 }
	
}

