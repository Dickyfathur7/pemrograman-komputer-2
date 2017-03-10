import java.security.KeyPairGenerator;
import java.security.KeyPair;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.security.PublicKey;
import java.security.PrivateKey;
import javax.crypto.Cipher;

public class Coba08AsymmetricSimple {
	public static void main(String args[]) {
		Coba08AsymmetricSimple app = new Coba08AsymmetricSimple();

		System.out.println("membuat public key dan private key");
		app.generateKey("private.key", "public.key");

		String message = "Pesan ini harus dirahasiakan, jangan sampai ada yang tau";
		System.out.println("proses enkripsi...");
		PublicKey publicKey = app.getPublicKey("public.key");
		byte[] encrypted = app.encrypt(message, publicKey);

		System.out.println("proses dekripsi...");
		PrivateKey privateKey = app.getPrivateKey("private.key");
		String result = app.decrypt(encrypted, privateKey);

		System.out.println("isi pesan : " + message);
		System.out.println("hasil enkripsi : " + new String(encrypted));
		System.out.println("hasil dekripsi : " + result);
	}

	public void generateKey(String privateKeyFile, String publicKeyFile) {
		try {
			KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
			keyGen.initialize(1024);
			KeyPair key = keyGen.generateKeyPair();

			File privateFile = new File(privateKeyFile);
			File publicFile = new File(publicKeyFile);

			// taruh public key di file
			ObjectOutputStream oosPubKey = new ObjectOutputStream(new FileOutputStream(publicFile));
			oosPubKey.writeObject(key.getPublic());
			oosPubKey.close();

			// taruh private key di file
			ObjectOutputStream oosPriKey = new ObjectOutputStream(new FileOutputStream(privateFile));
			oosPriKey.writeObject(key.getPrivate());
			oosPriKey.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public PublicKey getPublicKey(String keyFile) {
		PublicKey publicKey = null;
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(keyFile));
			publicKey = (PublicKey) ois.readObject();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return publicKey;
	}

	public PrivateKey getPrivateKey(String keyFile) {
		PrivateKey privateKey = null;
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(keyFile));
			privateKey = (PrivateKey) ois.readObject();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return privateKey;
	}

	public byte[] encrypt(String message, PublicKey key) {
		byte[] cipherText = null;
		try {
			Cipher cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.ENCRYPT_MODE, key);
			cipherText = cipher.doFinal(message.getBytes());
		} catch(Exception e) {
			e.printStackTrace();
		}
		return cipherText;
	}

	public String decrypt(byte[] encrypted, PrivateKey key) {
		byte[] decryptedText = null;
		try {
			Cipher cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.DECRYPT_MODE, key);
			decryptedText = cipher.doFinal(encrypted);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return new String(decryptedText);
	}
}
