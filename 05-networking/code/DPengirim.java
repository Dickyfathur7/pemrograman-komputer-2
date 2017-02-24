import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.DatagramPacket;

public class DPengirim {
	public static void main(String args[]) throws Exception {
		DatagramSocket ds = new DatagramSocket();
		String str = "pesan dari pengirim";
		InetAddress ip = InetAddress.getByName("127.0.0.1");

		DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);
		ds.send(dp);
		ds.close();
	}
}
