import java.util.HashSet;
import java.util.Iterator;

public class Contoh03HashSet {
	public static void main(String args[]) {
		HashSet data = new HashSet();

		data.add("Data 1");
		data.add("Data 2");
		data.add("Data 3");

		// -- cek pendambahan data 
		System.out.println("Penambahan data: ");
		Iterator iterator = data.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// -- tambah data yang sama isinya

		data.add("Data 2");

		System.out.println("\nPenambahan data yang sama : ");
		iterator = data.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
