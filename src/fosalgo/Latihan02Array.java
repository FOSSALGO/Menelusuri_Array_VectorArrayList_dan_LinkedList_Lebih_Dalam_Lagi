package fosalgo;

import java.util.Arrays;

public class Latihan02Array {
    public static void main(String[] args) {
        String[] data01 = new String[10];
                
        data01[4] = "Sidiq";
        data01[6] = "Praditya";
        data01[7] = "Causa";
        data01[0] = "Masdar";
        data01[8] = "Putra";
        data01[1] = "Afrisal";
        data01[2] = "Wawan";
        data01[3] = "Wisnu";
        data01[5] = "Izwar";
        data01[9] = "Rajab";
        
        int panjangArray = data01.length;
        System.out.println("Size of Array: "+panjangArray);
        
        ///Cetak semua isi array
        //Cara-1
        System.out.println("---------------------------------");
        System.out.println("data[0] = "+data01[0]);
        System.out.println("data[1] = "+data01[1]);
        System.out.println("data[2] = "+data01[2]);
        System.out.println("data[3] = "+data01[3]);
        System.out.println("data[4] = "+data01[4]);
        System.out.println("data[5] = "+data01[5]);
        System.out.println("data[6] = "+data01[6]);
        System.out.println("data[7] = "+data01[7]);
        System.out.println("data[8] = "+data01[8]);
        System.out.println("data[9] = "+data01[9]);
        
        //Cara-2
        System.out.println("---------------------------------");
        for(int k=0;k<panjangArray;k++){
            System.out.println("data["+k+"] = "+data01[k]);
        }
        
        //Cara-3
        System.out.println("---------------------------------");
        int iq = 0;
        for(String st: data01){
            System.out.println("data["+(iq++)+"] = "+st);           
        }
        
        //Cara-4
        System.out.println("---------------------------------");
        System.out.println(Arrays.toString(data01));

    }
}
