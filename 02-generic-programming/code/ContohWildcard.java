public class ContohWildcard {

	// percobaan pertama karena tidak menggunakan wildcard
	public void gambarDonk(ContohKelasGeneric<BentukGeometri> data) {
	// percobaan kedua yang berhasil
	//public void gambarDonk(ContohKelasGeneric<?> data) {
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
	}




}
