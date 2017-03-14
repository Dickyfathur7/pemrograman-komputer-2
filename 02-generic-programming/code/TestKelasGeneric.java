public class TestKelasGeneric {
	public static void main(String args[]) {
		ContohKelasGeneric<Integer> contoh = new ContohKelasGeneric<Integer>();
		contoh.add(2);
		System.out.println(contoh.get());

		// error saat compile, harusnya tipe integer
		//contoh.add("Ini teks");
	}
}
