public class ThreadSleep1 extends Thread {
	public void run() {
		for(int i=1; i<5; i++) {
			try {
				Thread.sleep(500);
			} catch(InterruptedException ie) {
				System.out.println(ie);
			}
			System.out.println("Thread 1: " + i);
		}
	}
}
