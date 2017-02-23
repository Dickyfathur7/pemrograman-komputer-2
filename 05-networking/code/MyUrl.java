import java.net.URL;

public class MyUrl {
	public static void main(String args[]) throws Exception  {
		URL url = new URL("http://informatika.poltektegal.ac.id/index.html");

		System.out.println("Protokol : " + url.getProtocol());
		System.out.println("Hostname : " + url.getHost());
		System.out.println("Port : " + url.getPort());
		System.out.println("File : " + url.getFile());
	}
}
