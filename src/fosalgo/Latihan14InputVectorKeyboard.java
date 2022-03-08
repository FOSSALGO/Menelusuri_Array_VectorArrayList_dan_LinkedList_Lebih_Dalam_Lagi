package fosalgo;

import java.util.Scanner;
import java.util.Vector;

public class Latihan14InputVectorKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> data = new Vector<>();
        
        while(sc.hasNextInt()){
            data.add(sc.nextInt());           
        }//proses input selesai
        
        System.out.println("---------------------");
        System.out.println(data);
    }
}
