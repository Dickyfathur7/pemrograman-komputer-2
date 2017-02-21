import java.util.HashSet;
import java.util.Iterator;


public class UbahDataHashSet {
	public static void main(String args[]) {
		HashSet hs = new HashSet();
		hs.add("Data 1");
		hs.add("Data 2");

		System.out.println("Data awal: ");
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		if(hs.contains("Data 2")) {
			hs.remove("Data 2");
			hs.add("Data Lain");
		}

		System.out.println("Data perubahan: ");
		it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
