package fosalgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class Latihan09 {
    public static void main(String[] args) {
        //cara-1: Array
        System.out.println("--------------------------------");
        System.out.println("Array");
        int[] data01 = {7, 8, 9, 0, 24, 67, 89, 12, 48};
        System.out.println(Arrays.toString(data01));
        
        //cara-2: Array
        System.out.println("--------------------------------");
        System.out.println("Array");
        int[] data02 = new int[9];
        data02[0] = 7;
        data02[1] = 8;
        data02[2] = 9;
        data02[3] = 0;
        data02[4] = 24;
        data02[5] = 67;
        data02[6] = 89;
        data02[7] = 12;
        data02[8] = 48;
        System.out.println(Arrays.toString(data02));
        data02[4] = 2578;
        System.out.println(Arrays.toString(data02));
        
        //VECTOR, ARRAYLIST, LINKEDLIST
        //cara-3: Vector
        System.out.println("--------------------------------");
        System.out.println("Vector");
        Vector<Integer> data03 = new Vector<>();
        data03.add(7);
        data03.add(8);
        data03.add(9);
        data03.add(0);
        data03.add(24);
        data03.add(67);
        data03.add(89);
        data03.add(12);
        data03.add(48);
        System.out.println(data03+" size: "+data03.size());
        //tambah elemen        
        data03.add(16);
        data03.add(22);
        System.out.println(data03+" size: "+data03.size());
        data03.set(4, 2578);
        System.out.println(data03+" size: "+data03.size());
        
        //cara-4: ArrayList
        System.out.println("--------------------------------");
        System.out.println("ArrayList");
        ArrayList<Integer> data04 = new ArrayList<>();
        data04.add(7);
        data04.add(8);
        data04.add(9);
        data04.add(0);
        data04.add(24);
        data04.add(67);
        data04.add(89);
        data04.add(12);
        data04.add(48);
        System.out.println(data04+" size: "+data04.size());
        //tambah elemen        
        data04.add(16);
        data04.add(22);
        System.out.println(data04+" size: "+data04.size());
        data04.set(4, 2578);
        System.out.println(data04+" size: "+data04.size());
        
       //cara-5: LinkedList
        System.out.println("--------------------------------");
        System.out.println("LinkedList");
        LinkedList<Integer> data05 = new LinkedList<>();
        data05.add(7);
        data05.add(8);
        data05.add(9);
        data05.add(0);
        data05.add(25);
        data05.add(67);
        data05.add(89);
        data05.add(12);
        data05.add(48);
        System.out.println(data05+" size: "+data05.size());
        //tambah elemen        
        data05.add(16);
        data05.add(22);
        System.out.println(data05+" size: "+data05.size());
        data05.set(4, 2578);
        System.out.println(data05+" size: "+data05.size());        
    }
}
