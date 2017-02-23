import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;

public class MyServer {
	public static void main(String args[]) {
		try {
			ServerSocket ss = new ServerSocket(12345);
			Socket s = ss.accept();

			DataInputStream dis = new DataInputStream(s.getInputStream());
			String str = (String) dis.readUTF();
			System.out.println("pesan = " + str);
			ss.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
