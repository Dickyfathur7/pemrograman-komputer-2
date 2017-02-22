public class NamaThread extends Thread {
	public void run() {
		System.out.println("Thread " + getName() + " berjalan");
	}

	public static void main(String args[]) {
		NamaThread t1 = new NamaThread();
		NamaThread t2 = new NamaThread();

		NamaThread t3 = new NamaThread();
		t3.setName("Nama Baru");

		t1.start();
		t2.start();
		t3.start();
	}
}
