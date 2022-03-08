package fosalgo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Latihan16BacaTulisElemenArrayDariFile {
    public static void main(String[] args) {
        String[] myData = bacaArray("mydata.csv");
        System.out.println(Arrays.toString(myData));
        myData[1] = "Rajab";
        boolean rTulis01 = saveArrayToFile(myData, "outData01.csv");
        
        System.out.println("------------------------");
        String[] dataku01 = bacaArraySatuBaris("mydata_1.csv");
        System.out.println(Arrays.toString(dataku01));
        dataku01[3]= "Asoka";
        boolean rTulis02 = saveArrayToFileSatuBaris(dataku01, "outData02.csv");
    }
    
    public static String[] bacaArray(String url){
        String[] result = null;
        try{
            FileReader fr = new FileReader(url);
            BufferedReader br = new BufferedReader(fr);
            String baris = br.readLine();//baca baris pertama
            int n = Integer.parseInt(baris);
            result = new String[n];
            for(int i=0;i<n;i++){
                baris = br.readLine();
                result[i] = baris;
            }
            br.close();
            fr.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        return result;
    }
    
    public static String[] bacaArraySatuBaris(String url){
        String[] result = null;
        try{
            FileReader fr = new FileReader(url);
            BufferedReader br = new BufferedReader(fr);
            String baris = br.readLine();//baca baris pertama
            result = baris.split(";");
            br.close();
            fr.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        return result;
    }
    
    public static boolean saveArrayToFile(String[] data, String url){
        boolean result = false;
        try{
            FileWriter fw = new FileWriter(url);
            BufferedWriter bw = new BufferedWriter(fw);
            int n = data.length;
            bw.append(n+"\n");
            for(int i=0;i<n;i++){
                bw.append(data[i]+"\n");
            }
            result = true;
            bw.close();
            fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        return result;
    }
    
    public static boolean saveArrayToFileSatuBaris(String[] data, String url){
        boolean result = false;
        try{
            FileWriter fw = new FileWriter(url);
            BufferedWriter bw = new BufferedWriter(fw);
            int n = data.length;
            for(int i=0;i<n;i++){
                bw.append(data[i]+";");
            }
            result = true;
            bw.close();
            fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        return result;
    }
}
