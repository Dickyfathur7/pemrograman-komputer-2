import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CobaMd5ToFile {

	public static void main(String args[]) {
		CobaMd5ToFile app = new CobaMd5ToFile();
		System.out.println(app.hashFile(args[0]));
	}

	public String hashFile(String file) {
		String hashed = "";

		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			FileInputStream fs = new FileInputStream(file);
			byte[] dataBytes = new byte[1024];

			int nread = 0;
			while((nread = fs.read(dataBytes)) != -1) {
				System.out.println(nread);
				md.update(dataBytes, 0, nread);
			}
			byte[] mdbytes = md.digest();

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
