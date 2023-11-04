package multithreading;

public class ThreadExtds extends Thread {
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("i am in thread one");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	
}
