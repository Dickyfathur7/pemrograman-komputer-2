import javax.crypto.KeyGenerator;
import java.security.Key;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;

public class SymmetricEncKeyFile {
	public void generateKey(String keyFile) {
		try {
			KeyGenerator keyGen = KeyGenerator.getInstance("DES");
			keyGen.init(56);
			Key key = keyGen.generateKey();
			FileOutputStream fos = new FileOutputStream(keyFile);
			fos.write(key.getEncoded());
			fos.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public byte[] readKeyFile(String keyFile) {
		byte[] fileContent = null;
		try {
			FileInputStream fin = new FileInputStream(keyFile);
			int len = fin.available();
			fileContent = new byte[len];
			fin.read(fileContent, 0, len);
			fin.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return fileContent;
	}

	public byte[] Encrypt(String message, byte[] keyEncoded) {
		byte[] encrypted = null;
		try {
			byte[] input = message.getBytes("UTF8");
			SecretKeySpec key = new SecretKeySpec(keyEncoded,  "DES");
			Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, key);
			encrypted = cipher.doFinal(input);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return encrypted;
	}

	public byte[] Decrypt(byte[] encrypted, byte[] keyEncoded) {
		byte[] plainText = null;
		try {
			SecretKeySpec key = new SecretKeySpec(keyEncoded, "DES");
			Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
			cipher.init(Cipher.DECRYPT_MODE, key);
			plainText = cipher.doFinal(encrypted);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return plainText;
	}

	public static void main(String args[]) {
		SymmetricEncKeyFile app = new SymmetricEncKeyFile();	
		app.generateKey("secret.key");
		String pesan = "Pesan ini harus dirahasiakan";

		byte[] key = app.readKeyFile("secret.key");
		byte[] encrypted = app.Encrypt(pesan, key);
		byte[] decrypted = app.Decrypt(encrypted, key);

		System.out.println("Pesan asli : " + pesan);
		System.out.println("Hasil enkripsi : " + new String(encrypted));
		System.out.println("Hasil dekripsi : " + new String(decrypted));
	}
}
