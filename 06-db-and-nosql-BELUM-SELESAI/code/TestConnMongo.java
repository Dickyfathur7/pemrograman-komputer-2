import com.mongodb.DB;
import com.mongodb.MongoClient;

public class TestConnMongo {
	public static void main(String args[]) {
		try {
			MongoClient mongoClient = new MongoClient("localhost",27017);
			DB db = mongoClient.getDB("test");
			System.out.println("Tersambung dengan database");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
