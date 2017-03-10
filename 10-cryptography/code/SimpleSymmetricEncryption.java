import javax.crypto.KeyGenerator;
import java.security.Key;
import javax.crypto.Cipher;

public class SimpleSymmetricEncryption {

	public static void main(String args[]) {
		SimpleSymmetricEncryption app = new SimpleSymmetricEncryption();
		app.demoEncryption();
	}

	public void demoEncryption() {
		try {
			String pesan = "Pesan ini harus dirahasiakan";
			byte[] plainText = pesan.getBytes("UTF8");

			// generate key
			System.out.println("Membentuk key...");
			KeyGenerator keyGen = KeyGenerator.getInstance("DES");
			keyGen.init(56);
			Key key = keyGen.generateKey();
			System.out.println("Done.");

			// siapkan objek DES
			Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");

			// enkripsi datanya
			System.out.println("Enkripsi...");
			cipher.init(Cipher.ENCRYPT_MODE, key);
			byte[] cipherText = cipher.doFinal(plainText);
			System.out.println("Selesai.");

			// dekripsi hasilnya
			System.out.println("Dekripsi...");
			cipher.init(Cipher.DECRYPT_MODE, key);
			byte[] newPlainText = cipher.doFinal(cipherText);
			System.out.println("Selesai.");

			System.out.println("\nPesan asli: " + pesan);
			System.out.println("Hasil enkripsi: " + new String(cipherText, "UTF8"));
			System.out.println("Hasil dekripsi: " + new String(newPlainText, "UTF8"));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
