import java.net.Socket;
import java.io.DataOutputStream;

public class MyClient {
	public static void main(String args[]) {
		try {
			Socket s = new Socket("localhost", 12345);
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Ini pesan dari client");
			dout.flush();
			dout.close();
			s.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	} 
}
