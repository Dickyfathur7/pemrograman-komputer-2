public class ContohJoin extends Thread {
	private String judul;

	public ContohJoin(String judul) {
		this.judul = judul;	
	}

	public void run() {
		for(int i=1; i<=5; i++) {
			try {
				Thread.sleep(500);
				System.out.println("Thread " + judul + " : " + i);
			} catch(InterruptedException ie) {
				System.out.println(ie);
			}
		}
	}

	public static void main(String args[]) {
		ContohJoin thread1 = new ContohJoin("1");
		ContohJoin thread2 = new ContohJoin("2");
		ContohJoin thread3 = new ContohJoin("3");
		
		thread1.start();
		try {
			thread1.join();
		} catch(InterruptedException ie) {
			System.out.println(ie);
		}

		thread2.start();
		thread3.start();
	}
}
