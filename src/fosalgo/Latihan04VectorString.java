package fosalgo;

import java.util.Vector;

public class Latihan04VectorString {
    public static void main(String[] args) {
        Vector<String> data02 = new Vector<>();
        
        data02.add("Sidiq");//0
        data02.add("Praditya");//1
        data02.add("Causa");//2
        data02.add("Masdar");//3
        data02.add("Putra");//4
        data02.add("Afrisal");//5
        data02.add("Wawan");//6
        data02.add("Wisnu");//7
        data02.add("Izwar");//8
        data02.add("Rajab");//9
        
        int panjangVector = data02.size();
        System.out.println("Panjang Vector = "+panjangVector);
        
        //Print-1
        System.out.println("-----------------------------");
        System.out.println("data02[0] = "+data02.get(0));
        System.out.println("data02[1] = "+data02.get(1));
        System.out.println("data02[2] = "+data02.get(2));
        System.out.println("data02[3] = "+data02.get(3));
        System.out.println("data02[4] = "+data02.get(4));
        System.out.println("data02[5] = "+data02.get(5));
        System.out.println("data02[6] = "+data02.get(6));
        System.out.println("data02[7] = "+data02.get(7));
        System.out.println("data02[8] = "+data02.get(8));
        System.out.println("data02[9] = "+data02.get(9));
        
        //Print-2
        System.out.println("-----------------------------");
        for(int i=0;i<panjangVector;i++){
            System.out.println("data02["+i+"] = "+data02.get(i));
        }
        
        //Print-3
        System.out.println("-----------------------------");
        int q = 0;
        for(String st : data02){
            System.out.println("data02["+(q++)+"] = "+st);
        }
        
        //Print-4
        System.out.println("-----------------------------");
        System.out.println(data02);
        
        //Tambah Elemen
        System.out.println("-----------------------------");
        System.out.println("Tambah Elemen");        
        data02.add("Marwan");//10
        data02.add("Cindi");//11
        data02.add(4, "Irawati");
        data02.add(4, "Pahri");
        data02.add(2, "Nadila");
        data02.add(1, "Nurmadina");
        data02.add("Nursam");
        panjangVector = data02.size();        
        System.out.println("Panjang Vector = "+panjangVector);
        System.out.println(data02);
        
        //Hapus Elemen
        System.out.println("-----------------------------");
        System.out.println("Hapus Elemen");  
        data02.remove(13);
        data02.remove(0);
        data02.add("Rajab");
        data02.add("Sidiq");
        data02.remove("Sidiq");
        System.out.println(data02);
        
        //Cari Elemen Pakai Contains
        //apakah Sidiq ada di Vector
        if(data02.contains("Sidiq")){
            System.out.println("Sidiq Ada di Dalam Vector");
        }else{
            System.out.println("Tidak ada Sidiq di Vector");
        }
        
    }
}
