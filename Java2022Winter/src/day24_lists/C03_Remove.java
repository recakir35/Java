package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        System.out.println(sayilar); // [ ]
        sayilar.add(5); // [5]
        sayilar.add(3); // [5, 3]
        sayilar.add(0,7); // [7, 5, 3]
        sayilar.add(2,7); // [7, 5, 7, 3]
        System.out.println(sayilar); // [7, 5, 7, 3]

        sayilar.remove(3);
        //sayilar.remove(5);


    }
}
