import java.util.HashSet;

public class ContohHashSetLain {
	public static void main(String args[]) {
		HashSet data = new HashSet();

		data.add("Teks 1");
		data.add("Teks 2");
		data.add("Teks 3");

		// setelah proses add data
		System.out.println("Setelah add data");
		for(Object obj : data) {
			if(obj instanceof String) {
				System.out.println(obj);
			}
		}

		// ubah data
		for(Object obj : data) {
			if(obj instanceof String) {
				if(obj.toString().equals("Teks 2")) {
				    String temp = (String) obj;
					temp = "Teks 5";
					data.add(temp);
					break;
				}
			}
		}

		// setelah ubah data
		System.out.println("\n\nSetelah ubah data");
		for(Object obj : data) {
			if(obj instanceof String) {
				System.out.println(obj);
			}
		}
	}
}
