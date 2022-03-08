package fosalgo;

import java.util.Scanner;
import java.util.Vector;

public class Latihan15InputVectorStringKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> data = new Vector<>();
        System.out.println("Input elemen Vector");
        
        String input;
        while(!(input=sc.nextLine()).equalsIgnoreCase("SELESAI")){
            data.add(input);
        }//proses looping untuk input selesai
        
        System.out.println("---------------------");
        System.out.println(data);
    }
}
