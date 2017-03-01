import com.mongodb.MongoClientURI;
import com.mongodb.MongoClient;
import com.mongodb.DB;

public class TestAuthMongo {
	public static void main(String args[]) {
		MongoClientURI uri = new MongoClientURI("mongodb://tamami:rahasia@localhost/?authSource=phb");
		MongoClient mongoClient = new MongoClient(uri);
		System.out.println("Sukses terhubung dengan auth");

		DB db = mongoClient.getDB("phb");

		MongoClient mongoClient2 = new MongoClient("localhost", 27017);
		System.out.println("Sukses terhubung tanpa auth");

		DB db1 = mongoClient2.getDB("phb");
	}
}
