public class ContohSleep extends Thread {

	public static void main(String args[]) {
		ThreadSleep1 thread1 = new ThreadSleep1();
		ThreadSleep2 thread2 = new ThreadSleep2();

		thread1.start();
		thread2.start();
	}
}
