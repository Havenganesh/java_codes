package multithreading;

public class ThreadDemo {
	
	public static void main(String[] args) {
//		ThreadOne t1=new ThreadOne();//object
//		Thread thread=new Thread(t1, "threadOne");//thread
//		thread.start();//start
//		
		
//		ThreadExtds t1= new ThreadExtds();
//		t1.start();
		
		Runnable r1=()->{
			for(int i=0;i<10;i++) {
				System.out.println("i am in thread one");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		};
		Thread t1= new Thread(r1, "runnable thread");
		t1.start();
		
		
		for(int i=0;i<10;i++) {
			System.out.println("i am in main thread");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}

}
