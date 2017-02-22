public class ContohThreadPriority extends Thread {
	public ContohThreadPriority(String nama) {
		setName(nama);
	}

	public void run() {
		System.out.println("Prioritas thread " + getName() + " : " + getPriority());
	}

	public static void main(String args[]) {
		ContohThreadPriority t1 = new ContohThreadPriority("A");
		ContohThreadPriority t2 = new ContohThreadPriority("B");

		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		t2.start();
	}
}
