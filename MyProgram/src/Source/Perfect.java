package Source;

import java.util.Scanner;

public class Perfect {

	
		
		 public static boolean isPerfectNumber(int number){
		         
		        int temp = 0;
		        for(int i=1;i<=number/2;i++){
		            if(number%i == 0){
		                temp += i;
		            }
		        }
		        if(temp == number){
		            System.out.println("It is a perfect number");
		            return true;
		        } else {
		            System.out.println("It is not a perfect number");
		            return false;
		        }
		    }
		     
		    public static void main(String args[]){
		       // PerfectNumber ipn = new PerfectNumber();
		    	Scanner sc = new Scanner(System.in);
		    	int n = sc.nextInt();
		        System.out.println("Is perfect number: "+isPerfectNumber(28));
		    }
		
	}


