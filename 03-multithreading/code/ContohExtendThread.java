public class ContohExtendThread extends Thread {
	public void run() {
		while(true) {
			System.out.println("thread berjalan");
		}
	}

	public static void main(String args[]) {
		ContohExtendThread app = new ContohExtendThread();
		app.setName("thread tamami");
		app.start();
	}
}
