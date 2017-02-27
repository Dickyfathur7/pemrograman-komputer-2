import com.mongodb.MongoClient;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.BasicDBObject;

public class TestCreateCollMongo {
 	public static void main(String args[]) {
		try {
			MongoClient mongoClient = new MongoClient("localhost", 27017);

			DB db = mongoClient.getDB("phb");
			System.out.println("Tersambung dengan DB");

			DBObject dbo = new BasicDBObject();
			DBCollection coll = db.createCollection("mataKuliah", dbo);
			System.out.println("Collection mataKuliah sudah jadi");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
