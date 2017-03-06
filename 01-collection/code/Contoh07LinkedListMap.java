import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;

public class Contoh07LinkedListMap {
	public static void main(String args[]) {
		LinkedHashMap data = new LinkedHashMap();

		// -- add data
		data.put("alamat", "jatibarang");
		data.put("nama", "tamami");

		System.out.println("hasil add data :");
		System.out.println("nama : " + data.get("nama"));
		System.out.println("alamat : " + data.get("alamat"));

		// -- lihat isi keyset
		Set set = data.keySet();
		Iterator iterator = set.iterator();
		System.out.println("\nisi keyset :");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// -- edit data
		data.put("alamat", "tegal");
		System.out.println("\nhasil edit data :");
		System.out.println(data.get("alamat"));

		// -- remove data
		data.remove("alamat");
		System.out.println("\nhasil remove data :");
		System.out.println(data.get("alamat"));
	}
}
