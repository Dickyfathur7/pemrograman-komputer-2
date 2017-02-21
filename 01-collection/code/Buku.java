public class Buku {
	private String judul;
	private String penulis;

	public Buku() {}

	public Buku(String judul, String penulis) {
		this.judul = judul;
		this.penulis = penulis;
	}

	public void setJudul(String judul) {
		this.judul = judul;
	}

	public String getJudul() {
		return judul;
	}

	public void setPenulis(String penulis) {
		this.penulis = penulis;
	}

	public String getPenulis() {
		return penulis;
	}
  
}
