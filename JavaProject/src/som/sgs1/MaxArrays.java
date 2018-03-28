package som.sgs1;

public class MaxArrays {

	public static void main(String[] args) 
	{

      int []a={12,15,4,96,42,8,3,5,78,1,0,89,5};
      int min=a[0];
       for (int i = 1; i < a.length; i++) 
       {
		if(min > a[i])
		{
			min=a[i];
			
		}
	   }

        System.out.println("The max element is: "+min);
	}

}
