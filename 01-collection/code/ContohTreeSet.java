import java.util.TreeSet;
import java.util.Iterator;

public class ContohTreeSet {
	public static void main(String args[]) {
		TreeSet ts = new TreeSet();

		ts.add("Buku");
		ts.add("Apel");
		ts.add("Nanas");

		Iterator it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
