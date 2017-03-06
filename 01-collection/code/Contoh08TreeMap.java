import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;

public class Contoh08TreeMap {
	public static void main(String args[]) {
		TreeMap data = new TreeMap();

		// -- add data
		data.put("nama", "tamami");
		data.put("alamat",  "jatibarang");
		System.out.println("Hasil add data :");
		System.out.println(data.get("nama"));
		System.out.println(data.get("alamat"));

		// -- lihat daftar key
		Set set = data.keySet();
		Iterator iterator = set.iterator();
		System.out.println("\ndaftar key yang tersedia :");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// -- edit data
		data.put("alamat", "tegal");
		System.out.println("\nhasil edit data :");
		System.out.println(data.get("nama"));
		System.out.println(data.get("alamat"));

		// -- hasil remove data
		data.remove("alamat");
		System.out.println("\nhasil remove data :");
		System.out.println(data.get("nama"));
		System.out.println(data.get("alamat"));
		
	}
}
