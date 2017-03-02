import com.mongodb.MongoClientURI;
import com.mongodb.MongoClient;
import com.mongodb.DB;
import org.bson.Document;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class TestAuthMongo {
	public static void main(String args[]) {
		MongoClientURI uri = new MongoClientURI("mongodb://tamami:rahasia@localhost/?authSource=phb");
		MongoClient mongoClient = new MongoClient(uri);
		System.out.println("Sukses terhubung dengan auth");

		MongoDatabase db = mongoClient.getDatabase("phb");

		MongoCollection<Document> coll = db.getCollection("mahasiswa");

		Document document = new Document("nim", "17005");
		document.append("name", "bambang");
		coll.insertOne(document);
		System.out.println("Data sudah masuk");

		//============================================= tanpa auth

		MongoClient mongoClient2 = new MongoClient("localhost", 27017);
		System.out.println("Sukses terhubung tanpa auth");

		MongoDatabase db1 = mongoClient2.getDatabase("phb");

		MongoCollection<Document> coll1 = db.getCollection("mahasiswa");

		Document doc1 = new Document("nim", "17006");
		doc1.append("name", "diva");
		coll1.insertOne(doc1);
		System.out.println("Data sudah masuk tanpa auth");
	}
}
