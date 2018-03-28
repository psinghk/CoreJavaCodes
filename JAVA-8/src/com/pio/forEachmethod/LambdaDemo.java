package com.pio.forEachmethod;

 interface A{
	 void show(int i);
 }
 
 /*class Test  implements A{

	@Override
	public void show(int i) {
		// TODO Auto-generated method stub
		System.out.println("Hello prabhat Singh : "+i);
	}
	 
 }*/
public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // By using Normal ways
		 /*A obj = new Test();
		 obj.show(10);*/
		
		
		//By Using BY Anonymous Inner Class
		/*A obj;
		obj = new A()
		{

			@Override
			public void show(int i) {
				// TODO Auto-generated method stub
				System.out.println("Hello Prabhat Singh:"+i);
			}
			
		};
		   obj.show(20);*/
		
		
		
		//By Using Lambda expresion 
		 A obj;
		 obj = i -> System.out.println("Hello prabhat: "+ i);
		 obj.show(10);
	}

}
