import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkerThread implements Runnable {
	private String pesan;
	
	public WorkerThread(String s) {
		this.pesan = s;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " (Start) pesan = " + pesan);
		prosesPesan();
		System.out.println(Thread.currentThread().getName() + " (End)");
	}

	private void prosesPesan() {
		try {
			Thread.sleep(2000);
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}

	public static void main(String args[]) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		for(int i=0; i<10; i++) {
			Runnable worker = new WorkerThread("Pesan ke-" + i);
			executor.execute(worker);
		}
		executor.shutdown();

		while(!executor.isTerminated()) {}

		System.out.println("Semua thread selesai");
	}
}
