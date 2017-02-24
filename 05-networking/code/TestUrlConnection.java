import java.net.URL;
import java.net.URLConnection;
import java.io.InputStream;

public class TestUrlConnection {
	public static void main(String args[]) {
		try {
			URL url = new URL("http://informatika.poltektegal.ac.id");
			URLConnection urlConn = url.openConnection();
			InputStream stream = urlConn.getInputStream();

			int i;
			while((i = stream.read()) != -1) {
				System.out.print((char)i);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
