import java.util.ArrayDeque;
import java.util.Iterator;

public class Contoh10ArrayDeque {
	public static void main(String args[]) {
		ArrayDeque data = new ArrayDeque();

		// -- add data
		data.add("data 1");
		data.addFirst("data 3");
		data.addLast("data 2");

		System.out.println("hasil add data :");
		Iterator iterator = data.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// -- edit data
		data.remove("data 1");
		data.add("data 5");

		System.out.println("\nhasil edit data :");
		iterator = data.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
