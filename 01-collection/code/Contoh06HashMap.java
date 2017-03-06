import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class Contoh06HashMap {
	public static void main(String args[]) {
		HashMap data = new HashMap();

		// -- add data
		data.put("alamat", "jatibarang");
		data.put("nama", "tamami");
		System.out.println("hasil add data : ");
		System.out.println(data.get(0));
		System.out.println(data.get("nama"));
		System.out.println(data.get("alamat"));

		// -- cek key set
		Set set = data.keySet();
		Iterator iterator = set.iterator();
		System.out.println("\nisi key set : ");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// -- edit data
		data.put("alamat", "tegal");
		System.out.println("\nhasil edit data : ");
		System.out.println(data.get("alamat"));

		// -- remove data
		data.remove("alamat");
		System.out.println("\nhasil remove data : ");
		System.out.println(data.get("alamat"));
		System.out.println(data.get("nama"));

	}
}
