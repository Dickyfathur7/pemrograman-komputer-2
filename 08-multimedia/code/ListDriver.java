import java.util.Vector;
import javax.media.CaptureDeviceInfo;
import javax.media.CaptureDeviceManager;

public class ListDriver {
	public static void main(String args[]) {
		Vector<CaptureDeviceInfo> devices = CaptureDeviceManager.getDeviceList(null);
		for(CaptureDeviceInfo cdi : devices) {
			System.out.println(cdi.getName());
		}
	}
}
