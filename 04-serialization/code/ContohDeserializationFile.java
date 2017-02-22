import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.Serializable;

public class ContohDeserializationFile {
	public static void main(String args[]) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.txt"));

		Mahasiswa mhs = (Mahasiswa) in.readObject();
		System.out.println(mhs.getNim()+" : " + mhs.getNama());
		in.close();
	}

}
