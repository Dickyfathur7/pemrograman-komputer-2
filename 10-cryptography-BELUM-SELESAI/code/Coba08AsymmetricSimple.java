import java.security.KeyPairGenerator;
import java.security.KeyPair;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

public class Coba08AsymmetricSimple {
	public static void main(String args[]) {
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
		}
	}
}
