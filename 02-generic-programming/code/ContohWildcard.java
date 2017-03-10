public class ContohWildcard {

	// percobaan pertama karena tidak menggunakan wildcard
	//public void gambarDonk(ContohKelasGeneric<BentukGeometri> data) {
	// percobaan kedua yang berhasil
	public void gambarDonk(ContohKelasGeneric<? extends BentukGeometri> data) {
		BentukGeometri geo = (BentukGeometri) data.get();
		geo.gambar();
	}
	
	public static void main(String args[]) {
		ContohWildcard app = new ContohWildcard();
		// percobaan pertama, gagal karena tidak ada wildcard
		ContohKelasGeneric<Kotak> gen = new ContohKelasGeneric<>();
		
		Kotak kotak = new Kotak();
		gen.add(kotak);
		app.gambarDonk(gen);

		// percobaan ketiga, gagal saat runtime
		// perbaikannya di method gambarDonk harus dikasih lower bounded
		ContohKelasGeneric<Integer> gen2 = new ContohKelasGeneric<>();

		//gen2.add(3);
		//app.gambarDonk(gen2);
	}




}
