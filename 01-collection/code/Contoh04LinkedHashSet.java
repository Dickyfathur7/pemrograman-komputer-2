import java.util.LinkedHashSet;
import java.util.Iterator;

public class Contoh04LinkedHashSet {
	public static void main(String args[]) {
		LinkedHashSet data = new LinkedHashSet();

		// -- add data
		data.add("Data 1");
		data.add("Data 2");
		data.add("Data 3");

		System.out.println("Hasil penambahan data : " + data.hashCode());
		Iterator iterator = data.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// -- add data yang sama
		data.add("Data 3");

		System.out.println("Hasil penambahan data sama : " + data.hashCode());
		iterator = data.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// -- edit data
		data.remove("Data 2");
		data.add("Data 5");

		System.out.println("Hasil edit data : " + data.hashCode());
		iterator = data.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// -- removeo data
		data.remove("Data 1");
		
		System.out.println("Hasil remove data : " + data.hashCode());
		iterator = data.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}
