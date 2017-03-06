import java.util.TreeSet;
import java.util.Iterator;

public class Contoh05TreeSet {

	public static void main(String args[]) {
		TreeSet data = new TreeSet();

		// -- add data
	
		data.add("tamami");
		data.add("oka");
		data.add("diva");
		data.add("dafa");
		
		Iterator iterator = data.iterator();
		System.out.println("hasil add data : ");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// -- edit data
		data.remove("dafa");
		data.add("nabila");
		
		iterator = data.iterator();
		System.out.println("\nhasil add data : ");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// -- test higher
		System.out.println("\nhasil higher : " + data.higher("priyanto"));
	}

}
