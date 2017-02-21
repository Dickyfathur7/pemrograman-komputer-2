import java.util.List;
import java.util.ArrayList;

public class BeforeGeneric {
	public static void main(String args[]) {
		List list = new ArrayList();
		list.add("Data 1");
		list.add("Data 2");
		String teks = list.get(0);
		System.out.println(teks);
	}
}
