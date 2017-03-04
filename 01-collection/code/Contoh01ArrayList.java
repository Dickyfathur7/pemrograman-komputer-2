import java.util.List;
import java.util.ArrayList;

public class Contoh01ArrayList {
	public static void main(String args[]) {
		List<String> list = new ArrayList();

		list.add("Data 1");
		System.out.println("Data 1 sudah masuk");
		list.add("Data 2");
		System.out.println("Data 2 sudah masuk");
		list.add("Data 3");
		System.out.println("Data 3 suudah masuk");

		list.remove(1);
		System.out.println("Data index ke-1 sudah terhapus");

		list.add(1, "Data 5 dari data baru");
		System.out.println("Data 5 dari data 2");

		list.add(1, "Data 4");

		for(String data : list) {
			System.out.println("> " + data);
		}
	}
}
