import com.mongodb.MongoClient;
import com.mongodb.DB;

public class TestConMongoWithAuth {
	public static void main(String args[]) {
		try {
		    // connect ke server
			MongoClient mongoClient = new MongoClient("localhost", 27017);

			// connect ke db
			DB db = mongoClient.getDB("phb");
			System.out.println("Tersambung dengan database");
			//boolean auth = db.authenticate("tamami", "rahasia");
			//System.out.println("Auth: " + auth);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
