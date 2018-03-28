package com.pio.forEachmethod;

import java.util.Arrays;
import java.util.List;

//java 8 forEach Method
public class DemoForEachMethod {
	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(4, 5, 6, 7);
		
		//System.out.println(values.size());
		 // These two below loops is External loops
		
		/*for (int i = 0; i < values.size(); i++) {
			System.out.println(values.get(i));
		}
*/
		
		/*for(int i : values){
			System.out.println(i);
		}*/
		
		
		
		// java 8 we have Internal Loops i:e forEach method
		
		  values.forEach(i -> System.out.println(i));
		  // this is much faster than externals loops.
		  // suppose if retrive huge amount of data for collection 
		   //it more faster than externals loops because it is part of
		  // collections.
	}

}
