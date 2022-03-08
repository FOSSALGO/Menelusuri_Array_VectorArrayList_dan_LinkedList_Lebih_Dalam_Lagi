package fosalgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class Latihan10 {
    public static void main(String[] args) {
        System.out.println("--------------------------------");
        System.out.println("Array");
        double[] data01 = {7.2, 8.1, 9.6, 0.25, 24.68, 67.8, 89.01, 12.27, 48};
        System.out.println(Arrays.toString(data01));
        
        System.out.println("--------------------------------");
        System.out.println("Array");
        double[] data02 = new double[9];
        data02[0] = 7.2;
        data02[1] = 8.1;
        data02[2] = 9.6;
        data02[3] = 0.25;
        data02[4] = 24.68;
        data02[5] = 67.8;
        data02[6] = 89.01;
        data02[7] = 12.27;
        data02[8] = 48;
        System.out.println(Arrays.toString(data02));
        
        System.out.println("--------------------------------");
        System.out.println("Vector");
        Vector<Double> data03 = new Vector<>();
        data03.add(7.2);
        data03.add(8.1);
        data03.add(9.6);
        data03.add(0.25);
        data03.add(24.68);
        data03.add(67.8);
        data03.add(89.01);
        data03.add(12.27);
        data03.add(48.0);
        System.out.println(data03);        
        data03.add(16.0);
        data03.add(22.7);
        System.out.println(data03);  
        
        System.out.println("--------------------------------");
        System.out.println("ArrayList");
        ArrayList<Double> data04 = new ArrayList<>();
        data04.add(7.2);
        data04.add(8.1);
        data04.add(9.6);
        data04.add(0.25);
        data04.add(24.68);
        data04.add(67.8);
        data04.add(89.01);
        data04.add(12.27);
        data04.add(48.0);
        System.out.println(data04);        
        data04.add(16.0);
        data04.add(22.7);
        System.out.println(data04);  
        
        System.out.println("--------------------------------");
        System.out.println("LinkedList");
        LinkedList<Double> data05 = new LinkedList<>();
        data05.add(7.2);
        data05.add(8.1);
        data05.add(9.6);
        data05.add(0.25);
        data05.add(24.68);
        data05.add(67.8);
        data05.add(89.01);
        data05.add(12.27);
        data05.add(48.0);
        System.out.println(data05);        
        data05.add(16.0);
        data05.add(22.7);
        System.out.println(data05);        
    }
}
