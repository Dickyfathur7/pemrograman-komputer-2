public class ThreadRunParah extends Thread {
	public ThreadRunParah(String name) {
		setName(name);
	}

	public void run() {
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(500);
				System.out.println("Thread " + getName() + " berjalan");
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String a[]) {
		ThreadRunParah t1 = new ThreadRunParah("A");
		ThreadRunParah t2 = new ThreadRunParah("B");

		t1.run();
		t2.run();
	}
}
