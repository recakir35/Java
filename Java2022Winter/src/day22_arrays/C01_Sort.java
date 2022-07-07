package day22_arrays;

import java.util.Arrays;

public class C01_Sort {
    public static void main(String[] args) {
        String arr[]={"S","M","A","T"};

        System.out.println(Arrays.toString(arr));//[S, M, A, T]

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[A, M, S, T]

        // javada bu sıralamaya natural order denir.
        // sayı olursa küçükten büyüye, metin olursa alfabatek sıraya göre sıralar


    }
}
