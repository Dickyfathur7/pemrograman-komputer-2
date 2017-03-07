import java.util.HashSet;
import java.util.Iterator;

public class Contoh03HashSet {
	public static void main(String args[]) {
		HashSet data = new HashSet();

		data.add("Data 1");
		data.add("Data 3");
		data.add("Data 2");

		// -- cek pendambahan data 
		System.out.println("Penambahan data: " + data.hashCode());
		Iterator iterator = data.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// -- tambah data yang sama isinya

		data.add("Data 2");

		System.out.println("\nPenambahan data yang sama : " + data.hashCode());
		iterator = data.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// -- edit data 
		data.remove("Data 2");
		data.add("Data 5");
		System.out.println("\nHasil edit data : " + data.hashCode());
		iterator = data.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}


		// -- remove data
		data.remove("Data 3");
		System.out.println("\nHasil remove data : " + data.hashCode());

		iterator = data.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
