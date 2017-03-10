import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CobaSHAToFile {

	public static void main(String args[]) {
		CobaSHAToFile app = new CobaSHAToFile();
		System.out.println(app.hashFile(args[0], args[1]));
	}

	public String hashFile(String file, String hashAlgorithm) {
		String hashed = "";

		try {
			MessageDigest sha = MessageDigest.getInstance(hashAlgorithm);
			FileInputStream fs = new FileInputStream(file);
			byte[] dataBytes = new byte[1024];

			int nread = 0;
			while((nread = fs.read(dataBytes)) != -1) {
				sha.update(dataBytes, 0, nread);
			}
			byte[] mdbytes = sha.digest();

			// convert byte to hex
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<mdbytes.length; i++) {
				sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
			}
			hashed = sb.toString();
		} catch(NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		return hashed;

	}

}
