import java.util.LinkedList;

public class Contoh02LinkedList {
	public static void main(String args[]) {
		LinkedList list = new LinkedList();

		list.add("Data 1");
		list.add("Data 2");
		list.add("Data 3");
		list.addFirst("Data 4");

		System.out.println("Tambah data");
		for(int i=0; i < list.size(); i++) {
			System.out.println("Data ke-" + i + " : " + list.get(i));
		}

		// -- edit element
		list.set(0, "Data ke 0.5");

		System.out.println("\nEdit Data");
		for(int i=0; i<list.size(); i++) {
			System.out.println("Data ke-" + (i + 1) + " : " + list.get(i));
		}

		// -- remove element
		list.remove(1);
		list.remove("Data 3");

		System.out.println("\nHapus Data");

		for(int i=0; i<list.size(); i++) {
			System.out.println("Data ke-" + (i + 1) + " : " + list.get(i));
		}

	}
}
