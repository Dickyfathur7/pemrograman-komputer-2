import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ContohSerializationFile {
	public static void main(String args[]) throws Exception {
		Mahasiswa mhs = new Mahasiswa("0001","tamami");

		FileOutputStream fout = new FileOutputStream("file.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);

		out.writeObject(mhs);
		out.flush();
		System.out.println("Selesai");
	}

}
