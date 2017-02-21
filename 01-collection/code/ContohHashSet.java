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
    
    // contoh add
    System.out.println("Contoh setelah add");
    for(Object obj : set) {
      if(obj instanceof Buku) { 
        Buku data = (Buku) obj;
        System.out.println("Buku : " + data.getJudul());
      }
    }

    buku2.setJudul("Buku 4");
    set.add(buku2);

    // contoh setelah edit
    System.out.println("\n\nContoh setelah edit");
    for(Object obj : set) {
      if(obj instanceof Buku) {
        Buku data = (Buku) obj;
	System.out.println("Buku : " + data.getJudul());
      }
    }

    set.remove(buku1);

    // contoh setelah hapus
    System.out.println("\n\nContoh setelah hapus");
    for(Object obj : set) {
      if(obj instanceof Buku) {
        Buku data = (Buku) obj;
	System.out.println("Buku : " + data.getJudul());
      }
    }
  }
}
