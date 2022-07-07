package day22_arrays;

import java.util.Arrays;

public class C04_TerstenSiralayipKaydetme {
    public static void main(String[] args) {
        // verilen bir array'i büyükten küçüğe sıralayıp bize döndüren bir methot oluşturunuz

        int arr[] = {3, 5, 6, 1, 9, 0, 45, 25, 4, 9, 0};

        arr=terstenSirala(arr);
        System.out.println(Arrays.toString(arr));//[45, 25, 9, 9, 6, 5, 4, 3, 1, 0, 0]

    }

    public static int[] terstenSirala(int[] arr) {
        Arrays.sort(arr);
        int tersarr[]=new int[arr.length];//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        for (int i = 0; i < arr.length; i++) {
            tersarr[i] = arr[arr.length-1-i] ;

        }
        return tersarr;
    }
}
