import java.net.InetAddress;

public class TestInet {
	public static void main(String args[]) {
		try {
			InetAddress ip = InetAddress.getByName("informatika.poltektegal.ac.id");

			System.out.println("Hostname : " + ip.getHostName());
			System.out.println("IP Address : " + ip.getHostAddress());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
