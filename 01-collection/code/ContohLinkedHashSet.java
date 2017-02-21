import java.util.LinkedHashSet;
import java.util.Iterator;

public class ContohLinkedHashSet {
 	public static void main(String args[]) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Data 1");
		lhs.add("Data 2");
		lhs.add(null);

		Iterator it = lhs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
