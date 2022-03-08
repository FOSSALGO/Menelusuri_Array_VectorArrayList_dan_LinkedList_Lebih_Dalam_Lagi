package fosalgo;

import java.util.Vector;

public class Latihan11VectorBertipeClass {
    public static void main(String[] args) {
        Vector<Buku> tabelBuku = new Vector();
        //Add Data
        
        Buku buku1 = new Buku(1, "Pemrograman Java", 75000, "Penerbit Andi", 2);
        tabelBuku.add(buku1);
        
        Buku buku2 = new Buku(2, "Pemrograman Berorientasi Object", 125000, "Graha ilmu", 3);
        tabelBuku.add(buku2);
        
        tabelBuku.add(new Buku(3, "Rekayasa Perangkat Lunak", 85000, "Informatika", 5));
        
        tabelBuku.add(new Buku(4, "Artificial Intelligence", 150000, "Graha ilmu", 2));
        
        tabelBuku.add(new Buku(5, "Naïve Bayes", 75000, "Graha ilmu", 6));
        
        tabelBuku.add(new Buku(6, "Algoritma dan Struktur Data", 82000, "Penerbit Andi", 4));
        
        System.out.println("---------------------------");
        System.out.println("Isi Tabel Buku");
        System.out.println(tabelBuku);
        
        System.out.println("---------------------------");
        System.out.println("Tampilkan buku index = 2");
        Buku myBuku = tabelBuku.get(2);
        System.out.println(myBuku);
        
        boolean status = myBuku.jual(3);
        System.out.println(status?"Berhasil Menjual Buku":"Stock tidak cukup");
        System.out.println(myBuku);
        
    }
}
