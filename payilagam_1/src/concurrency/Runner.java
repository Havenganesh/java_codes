package concurrency;

public class Runner {
	public static void main(String[] args) {
		Runnable run=new Thread();
		run=()->{
			for(int i=0;i<10;i++) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
				System.out.println("hi this is run");
			}
		};
		Thread t1=new Thread(run);
		t1.start();
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("hi this is main");
		}
	}
}
