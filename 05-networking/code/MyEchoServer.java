import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyEchoServer {
	public static void main(String args[]) throws Exception {
		ServerSocket ss = new ServerSocket(12345);
		Socket s = ss.accept();

		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = "";
		String str2;

		while(!str.equals("stop")) {
			str = din.readUTF();
			System.out.println("Client : " + str);

			str2 = br.readLine();
			dout.writeUTF(str2);
			dout.flush();
		}

		din.close();
		s.close();
		ss.close();
	}
}
