public class ContohImplRunnable implements Runnable {
	public void run() {
		System.out.println("Thread berjalan");
	}

	public static void main(String args[]) {
		ContohImplRunnable app = new ContohImplRunnable();
		Thread thread = new Thread(app);
		thread.start();
	}
}
