package lesson16_Arrays;

import java.util.Arrays;

public class Q02_BuyuktenKucugeSiralama {
    public static void main(String[] args) {
        // verilen bir array'i büyükten küçüğe sıralayıp yazdıran bir methot oluşturunuz
        int arr[] = {3, 5, 6, 1, 9, 0, 45, 25, 4, 9, 0};
        terstenSiralaYazdır(arr);
    }

    public static void terstenSiralaYazdır(int[] arr) {
        Arrays.sort(arr);
        int tersarr[]=new int[arr.length];//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        for (int i = 0; i < arr.length; i++) {
            tersarr[i] = arr[arr.length-1-i] ;

        }
        System.out.println(Arrays.toString(tersarr));//[45, 25, 9, 9, 6, 5, 4, 3, 1, 0, 0]
    }
}
