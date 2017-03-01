import com.mongodb.MongoClientURI;
import com.mongodb.MongoClient;
import com.mongodb.DB;
import org.bson.Document;
import com.mongodb.client.MongoCollection;

public class TestAuthMongo {
	public static void main(String args[]) {
		MongoClientURI uri = new MongoClientURI("mongodb://tamami:rahasia@localhost/?authSource=phb");
		MongoClient mongoClient = new MongoClient(uri);
		System.out.println("Sukses terhubung dengan auth");

		DB db = mongoClient.getDB("phb");

		MongoCollection<Document> coll = db.getCollection("mahasiswa");

		Document document = new Document("nim", "17005");
		document.append("name", "bambang");
		document.insertOne(document);
		System.out.println("Data sudah masuk");

		//=============================================

		MongoClient mongoClient2 = new MongoClient("localhost", 27017);
		System.out.println("Sukses terhubung tanpa auth");

		DB db1 = mongoClient2.getDB("phb");
	}
}
