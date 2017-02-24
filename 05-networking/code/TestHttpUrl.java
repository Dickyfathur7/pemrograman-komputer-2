import java.net.URL;
import java.net.HttpURLConnection;

public class TestHttpUrl {
	public static void main(String args[]) {
		try {
			URL url = new URL("http://informatika.poltektegal.ac.id");
			HttpURLConnection huc = (HttpURLConnection) url.openConnection();

			for(int i=1; i<=10; i++) {
				System.out.println(huc.getHeaderFieldKey(i) + " : " + huc.getHeaderField(i));
			}
			huc.disconnect();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
