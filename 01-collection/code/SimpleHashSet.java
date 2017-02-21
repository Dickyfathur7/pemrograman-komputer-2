import java.util.HashSet;
import java.util.Iterator;

public class SimpleHashSet {
	public static void main(String args[]) {
		HashSet hs = new HashSet();
		hs.add("Data 1");
		hs.add("Data 2");
		hs.add("Data 1");

		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
