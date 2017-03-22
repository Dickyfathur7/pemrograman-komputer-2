public class DaemonThread extends Thread {

	public void run() {
		if(Thread.currentThread().isDaemon()) { 
			while(true) {
				System.out.println("thread " + getName() + " : thread setan berjalan");
			}
		} else {
			System.out.println("thread " + getName() + " : thread biasa ini mah");
		}
	}

	public static void main(String []a) {
		DaemonThread t1 = new DaemonThread();
		DaemonThread t2 = new DaemonThread();

		t1.setName("satu");
		t2.setName("dua");

		t1.setDaemon(true);

		t1.start();
		t2.start();
	}
}
