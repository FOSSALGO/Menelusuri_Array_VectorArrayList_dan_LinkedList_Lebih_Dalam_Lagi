package fosalgo;

import java.util.ArrayList;

public class Latihan05ArrayList {
    public static void main(String[] args) {
        ArrayList arrayList01 = new ArrayList();
        
        arrayList01.add("Rajab");
        arrayList01.add(45.8);
        arrayList01.add("Ilham");
        arrayList01.add(16);
        arrayList01.add(83.7);
        arrayList01.add("Rahmawati");
        arrayList01.add("Adam");
        
        //panjang ArrayList
        int panjangAL = arrayList01.size();
        System.out.println("Size ArrayList: "+panjangAL);
        
        //Print-1
        System.out.println("---------------------------");
        System.out.println("data[0] = "+arrayList01.get(0));        
        System.out.println("data[1] = "+arrayList01.get(1));     
        System.out.println("data[2] = "+arrayList01.get(2));     
        System.out.println("data[3] = "+arrayList01.get(3));     
        System.out.println("data[4] = "+arrayList01.get(4));     
        System.out.println("data[5] = "+arrayList01.get(5));     
        System.out.println("data[6] = "+arrayList01.get(6));
        
        //Print-2
        System.out.println("---------------------------");
        for(int k = 0;k<arrayList01.size();k++){
            System.out.println("data["+k+"] = "+arrayList01.get(k)); 
        }
        
        //Print-3
        System.out.println("---------------------------");
        int iq = 0;
        for(Object obj : arrayList01){
            System.out.println("data["+(iq++)+"] = "+obj);
        }
        
        //Print-4
        System.out.println("---------------------------");
        System.out.println(arrayList01);
        
        //Menambahkan Data
        System.out.println("---------------------------");
        arrayList01.add("Marwan");
        arrayList01.add("Cindi");
        arrayList01.add("Nadilatul");
        arrayList01.add("Nurmadina");
        arrayList01.add("Irawati");
        arrayList01.add("Nursam");
        arrayList01.add("Subaeka");
        arrayList01.add("rahmawati");
        arrayList01.add("Iman");
        
        panjangAL = arrayList01.size();
        System.out.println("Size ArrayList: "+panjangAL);
        System.out.println(arrayList01);
        
        //Gunakan contains
        String keyword = "Juned";
        //int keyword = 17;
        if(arrayList01.contains(keyword)){
            System.out.println(keyword+" ada di data");
        }else{
            System.out.println(keyword+" tidak ada di data");
        }
        


    }
}
