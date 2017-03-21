public class ThreadRun extends Thread {
	public void run() {
		System.out.println("Running Thread");
	}

	public static void main(String a[]) {
		ThreadRun thread = new ThreadRun();

		thread.run();
	}
}
