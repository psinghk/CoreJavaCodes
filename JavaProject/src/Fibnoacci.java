import java.util.Scanner;

public class Fibnoacci {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the term:");
		 int n =sc.nextInt();
		 for (int i = 0; i < n; i++)
		 {
			 System.out.print(fib(i)+" ");
			
		 }

	}
	 public static int fib(int n)
	 {
		 if(n>1)
		 {
			 return fib(n-1)+fib(n-2);
		 }
		 else{
			 return 1;
		 }
	 }

}
