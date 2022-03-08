package fosalgo;

import java.util.Arrays;
import java.util.Scanner;

public class Latihan13InputArrayKeyBoardDouble {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Input Panjang Array: ");
        int n = scr.nextInt();
        double[]data = new double[n];
        for(int k=0;k<n;k++){
            System.out.print("input data["+k+"]: ");
            data[k] = scr.nextDouble();
        }//akhir pembacaan elemen array
        
        System.out.println("----------------");
        System.out.println(Arrays.toString(data));
    }
}
