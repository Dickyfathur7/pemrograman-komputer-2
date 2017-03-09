import javax.crypto.Cipher;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.SecretKey;

public class SymmetricInputKey {

	public byte[] encrypt(String password) throws Exception {
		byte[] result;
		byte[] salt = {
			(byte)0xde, (byte)0x53, (byte)0x37, (byte)0xdf,
			(byte)0xab, (byte)0x73, (byte)0x33, (byte)0xce
		};

		int count = 20;

		String plainText = "Ini pesan rahasia yang harus disembunyikan";

		PBEParameterSpec pbeParamSpec = new PBEParameterSpec(salt, count);
		PBEKeySpec pbeKeySpec = new PBEKeySpec(password.toCharArray());
		SecretKeyFactory keyFac = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
		SecretKey pbeKey = keyFac.generateSecret(pbeKeySpec);

		Cipher cipher = Cipher.getInstance("PBEWithMD5AndDES");
		cipher.init(Cipher.ENCRYPT_MODE, pbeKey, pbeParamSpec);
		result = cipher.doFinal(plainText.getBytes("UTF8"));
		return result;
	}
}
