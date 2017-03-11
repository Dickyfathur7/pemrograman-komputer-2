import java.util.Enumeration;
import gnu.io.CommPortIdentifier;

public class CheckPort {
	public static void main(String args[]) {
		Enumeration<CommPortIdentifier> ports = CommPortIdentifier.getPortIdentifiers();
		while(ports.hasMoreElements()) {
			CommPortIdentifier info = ports.nextElement();
			System.out.println(info.getName());
		}
	}
}
