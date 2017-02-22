public class ContohExtendThread extends Thread {
	public void run() {
		System.out.println("thread berjalan");
	}

	public static void main(String args[]) {
		ContohExtendThread app = new ContohExtendThread();
		app.start();
	}
}
