package lesson40_collections;

import java.util.Arrays;
import java.util.HashSet;

public class Ex06_ {
    public static void main(String[] args) {
        // Soru 1 : Bir HashSet random olarak 10(set.size(10)) adet olacak şekilde
        // 1 den 20 e kadar olan sayılarla doldurup yazdırın
        // Soru 2 : Bu SET i bir fonksiyonda diziye çevirinizve yazdırınız.

        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            hs.add((int) (Math.random() * 20));
        }
        System.out.println("HashSet= "+hs);

        // Soru 2 : Bu SET i bir fonksiyonda diziye çevirinizve yazdırınız.
        System.out.println("Array List= "+Arrays.toString(diziyeCevirme(hs)));
    }

    private static int[] diziyeCevirme(HashSet<Integer> hs) {
        int arr[]=new int[hs.size()];
        int i=0;
        for (int each:hs) {
          arr[i]=each;
          i++;
        }
        return arr;
    }
}
