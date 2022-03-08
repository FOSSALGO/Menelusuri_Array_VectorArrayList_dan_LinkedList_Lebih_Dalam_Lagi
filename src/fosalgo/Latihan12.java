package fosalgo;

import java.util.Scanner;

public class Latihan12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            String input = sc.nextLine();
            System.out.println(input);
        }
        
        System.out.println("-------------------");
        String input;
        while(!(input = sc.nextLine()).equalsIgnoreCase("EXIT")){
            System.out.println(input);
        }
    }
}
