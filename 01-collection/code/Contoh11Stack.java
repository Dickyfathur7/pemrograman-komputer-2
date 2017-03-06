import java.util.Stack;
import java.util.Iterator;

public class Contoh11Stack {
	public static void main(String args[]) {
		Stack data = new Stack();

		// -- add data
		data.push("data 1");
		data.add("data 2");
		data.insertElementAt("data 3", 1);

		System.out.println("hasil add data :");
		Iterator iterator = data.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// -- get data
		System.out.println("data yang diambil : " + data.pop());
		System.out.println("data yang akan diambil berikutnya : " + data.peek());
	}
}
