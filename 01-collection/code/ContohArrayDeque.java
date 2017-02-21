import java.util.ArrayDeque;

public class ContohArrayDeque {
	public static void main(String args[]) {
		ArrayDeque<String> ad = new ArrayDeque<String>();
		ad.add("Data 1");
		ad.offer("Data 2");
		ad.add("Data 3");
		ad.offerFirst("Data 1/2");

		for(String data : ad) {
			System.out.println(data);
		}

		System.out.println("\nData pertama yang dihapus : " + ad.poll());
		System.out.println("Sisa data: ");
		for(String data: ad) {
			System.out.println(data);
		}

	}
}
