package Source;

 class MyThread extends Thread
 {
	 public void start() 
	 {
		  super.start();
		System.out.println(" start method");
	}
	 public void run() 
	 {
			System.out.println("run method");
	}
 }

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MyThread t = new MyThread();
       t.start();
       
       System.out.println("main method");
      
	}

}
