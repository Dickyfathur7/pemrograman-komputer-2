public class ContohShutdownHook extends Thread {
	public void run() {
		System.out.println("Aplikasi sudah keluar");
	}

	public static void main(String args[]) {
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(new ContohShutdownHook());

		System.out.println("Sistem tidur.. tekan Ctrl+C untuk keluar");
		try {
			Thread.sleep(30000);
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
