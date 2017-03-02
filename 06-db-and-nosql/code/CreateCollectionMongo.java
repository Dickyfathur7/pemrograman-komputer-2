import com.mongodb.MongoClient;
import com.mongodb.DB;
import com.mongodb.DBCollection;

public class CreateCollectionMongo {
	public static void main(String args[]) {
		try {
			MongoClient mongoClient = new MongoClient("localhost", 27017);
	
			DB db = mongoClient.getDB("mahasiswa");
			System.out.println("Tersambung ke db mahasiswa");

			DBCollection coll = db.createCollection("dosen");
			System.out.println("Collection dosen sudah terbentuk");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
