import java.util.PriorityQueue;
import java.util.Iterator;

public class Contoh09PriorityQueue {
	public static void main(String args[]) {	
		PriorityQueue data = new PriorityQueue();

		// -- add data
		data.add("data 1");
		data.offer("data 3");
		data.add("data 2");

		System.out.println("hasil add data :");
		Iterator iterator = data.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// -- tambah data yang sama
		data.add("data 1");
		System.out.println("\nhasil add data sama :");
		iterator = data.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// -- hapus data
		data.remove("data 1");
		System.out.println("\nhasil remove data :");
		iterator = data.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// -- edit data
		data.remove("data 3");
		data.add("data 5");
		System.out.println("\nhasil edit data :");
		iterator = data.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}


		// -- lihat data yang bisa diambil
		System.out.println("\ndata yang dapat diambil :");
		System.out.println(data.peek());

		// -- ambil data
		System.out.println("\nisi datanya : " + data.poll());
		System.out.println("\ndata yang dapat diambil : " + data.peek());

	}
}
