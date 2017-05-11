import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class ContohKoneksi {
	public static void main(String args[]) {
		try {
			// langkah 1, register drivernya
			Class.forName("com.mysql.jdbc.Driver");
			// untuk Oracle
			//Class.forName("oracle.jdbc.driver.OracleDriver");

			// langkah 2, buat objek Connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/phb","tamami","rahasia");

			// langkah 3, buat objek Statement
			Statement stmt = conn.createStatement();

			// langkah 4, eksekusi query
			// lebih valid bila pemanggilan kolom jangan menggunakan bintang, tapi didefinisikan.
			// karena berimbang ke pemanggilan rs.getString(), sebaiknya nanti menggunakan nama kolom, bukan indeks
			ResultSet rs = stmt.executeQuery("select * from mahasiswa");
			while(rs.next()) {
				System.out.println(rs.getString(1) + " : " + rs.getString(2));
			}

			// langkah 5, tutup koneksi
			conn.close();
		} catch(Exception e) { e.printStackTrace(); }
	}
}
