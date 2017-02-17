import java.util.HashSet;

public class ContohHashSet {
  

  public static void main(String args[]) {
    HashSet set = new HashSet();
    Buku buku1 = new Buku("Buku 1", "Penulis 1");
    Buku buku2 = new Buku("Buku 2", "Penulis 2");
    Buku buku3 = new Buku("Buku 3", "Penulis 3");
    set.add(buku1);
    set.add(buku2);
    set.add(buku3);
    for(Buku data :  set) {
      System.out.println("Buku : " + data.getJudul());
    }
  }
}
