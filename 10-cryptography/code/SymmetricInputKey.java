import javax.crypto.Cipher;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.SecretKey;

public class SymmetricInputKey {

	byte[] salt = {
		(byte)0xde, (byte)0x53, (byte)0x37, (byte)0xdf,
		(byte)0xab, (byte)0x73, (byte)0x33, (byte)0xce
	};
	int count = 20;
	PBEParameterSpec pbeParamSpec;
	PBEKeySpec pbeKeySpec;
	SecretKeyFactory keyFac;
	SecretKey pbeKey;

	public void init(String password) throws Exception {
		pbeParamSpec = new PBEParameterSpec(salt, count);
		pbeKeySpec = new PBEKeySpec(password.toCharArray());
		keyFac = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
		pbeKey = keyFac.generateSecret(pbeKeySpec);
	}

	public byte[] encrypt(String password) throws Exception {
		byte[] result;

		String plainText = "Ini pesan rahasia yang harus disembunyikan";
	
		init(password);

		Cipher cipher = Cipher.getInstance("PBEWithMD5AndDES");
		cipher.init(Cipher.ENCRYPT_MODE, pbeKey, pbeParamSpec);
		result = cipher.doFinal(plainText.getBytes("UTF8"));
		return result;
	}

	public byte[] decrypt(byte[] encryptedData, String password) throws Exception {
		byte[] result;

		init(password);

		Cipher cipher = Cipher.getInstance("PBEWithMD5AndDES");
		cipher.init(Cipher.DECRYPT_MODE, pbeKey, pbeParamSpec);
		result = cipher.doFinal(encryptedData);
		return result;
	}

	public static void main(String args[]) throws Exception {
		SymmetricInputKey app = new SymmetricInputKey();
		byte[] result = app.encrypt(args[0]);
		System.out.println("Hasil enkripsi : " + new String(result));
		System.out.println("Hasil dekripsi : " + new String(app.decrypt(result, args[0])));
	}
}
