public class ContohJoin2 extends Thread {
	private String judul;

	public ContohJoin2(String judul) {
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
		ContohJoin2 t1 = new ContohJoin2("1");
		ContohJoin2 t2 = new ContohJoin2("2");
		ContohJoin2 t3 = new ContohJoin2("3");

		t1.start();
		try {
			t1.join(1500);
		} catch(InterruptedException ie) {
			System.out.println(ie);
		}

		t2.start();
		t3.start();
	}
}
