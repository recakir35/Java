package lesson16_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

        int arr[]; // değer ataması yapılmadan java kabul etti
        arr= new int[6];
        System.out.println(Arrays.toString(arr)); //[0, 0, 0, 0, 0, 0]
        System.out.println(arr.length);// 6
                                        // String deki length(), bunda yok
        // arraydeki her bir elemanı index degeri kadar artiralım

        for (int i = 0; i < arr.length; i++) {
            arr[i] +=i;

        }
        System.out.println(Arrays.toString(arr)); //[0, 1, 2, 3, 4, 5]

        // son index'deki elementi yazdıralım
        System.out.println(arr[arr.length - 1]);//5
    }
}
