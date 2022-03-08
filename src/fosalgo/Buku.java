package fosalgo;

public class Buku {
    int id;
    String judul;
    double harga;
    String penerbit;
    int stock;
    int terjual;

    public Buku(int id, String judul, double harga, String penerbit, int stock) {
        this.id = id;
        this.judul = judul;
        this.harga = harga;
        this.penerbit = penerbit;
        this.stock = stock;
        this.terjual = 0;
    }

    boolean jual(int numJual){
        boolean status = false;
        if(numJual<=stock){
            status = true;
            stock = stock - numJual;
            terjual = terjual + numJual;
        }
        return status;
    }
    
    public String toString(){
        return 
                "\n{ ID:"+id+
                " | Judul Buku: "+judul+
                " | Harga: "+harga+
                " | Penerbit: "+penerbit+
                " | Stock: "+stock+
                " | Terjual: "+terjual+" }";
    }
}
