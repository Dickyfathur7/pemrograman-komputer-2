import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CobaMd5 {

	public static void main(String args[]) {
		CobaMd5 app = new CobaMd5();
		System.out.println(app.hash("Coba aja"));
		System.out.println(app.hash("Coba lagi"));
		System.out.println(app.hash("Yang ini coba lebih panjang"));
		System.out.println("\nCoba data sama:");
		System.out.println("data \"Coba Hashing\" : " + app.hash("Coba Hashing"));
		System.out.println("data \"Coba Hashing\" : " + app.hash("Coba Hashing"));
		System.out.println("data \"Coba Hashin\"  : " + app.hash("Coba Hashin"));
	}

	public String hash(String data) {
		String hashed = "";

		try {
			MessageDigest md5;
			md5 = MessageDigest.getInstance("MD5");
			md5.update(data.getBytes());

			byte byteData[] = md5.digest();

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
