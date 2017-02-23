import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class MyEchoClient {
	public static void main(String args[]) throws Exception {
		Socket s = new Socket("localhost", 12345);

		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = "";
		String str2;

		while(!str.equals("stop")) {
			str = br.readLine();
			dout.writeUTF(str);
			dout.flush();
			str2 = din.readUTF();
			System.out.println("Server : " + str2);
		}

		dout.close();
		s.close();
	}
}
