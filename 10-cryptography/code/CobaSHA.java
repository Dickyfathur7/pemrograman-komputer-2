import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CobaSHA {
	public static void main(String args[]) {
		CobaSHA app = new CobaSHA();
		System.out.println(app.hash(args[0], args[1]));
	}

	public String hash(String data, String hashAlgorithm) {
		String hashed = "";

		try {
			MessageDigest sha = MessageDigest.getInstance(hashAlgorithm);
			sha.update(data.getBytes());
			 
			byte byteData[] = sha.digest();

			// convert byte to hex
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<byteData.length; i++) {
				sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
			}
			hashed = sb.toString();
		} catch(NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return hashed;
	}
}
