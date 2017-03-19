public class SameThread extends Thread {
	public void run() {
		for(int i=0; i<5; i++) 
			System.out.println("Thread berjalan");
	}

	public static void main(String args[]) {
		SameThread thread = new SameThread();

		thread.start();
		thread.start();
	}
}
