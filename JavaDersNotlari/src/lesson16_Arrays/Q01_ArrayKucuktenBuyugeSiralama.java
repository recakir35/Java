package lesson16_Arrays;

import java.util.Arrays;

public class Q01_ArrayKucuktenBuyugeSiralama {
    public static void main(String[] args) {
        // verilen bir array'de en kucuk ve en buyuk degerleri yazdirin

        int arr[] = {3, 5, 6, 1, 9, 0, 45, 25, 4, 9, 0};

        // sort methodu olmadan yapalım

        int enKucukSayi = Integer.MAX_VALUE;//arr[0];
        int enBuyukSayi = Integer.MIN_VALUE;//arr[0];


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < enKucukSayi) {
                enKucukSayi = arr[i];
            }
            if (arr[i]>enBuyukSayi){
                enBuyukSayi=arr[i];
            }
        }
        System.out.println( "Array'daki en küçük sayı: "+enKucukSayi);
        System.out.println( "Array'daki en büyük sayı: "+enBuyukSayi);

        Arrays.sort(arr);
        System.out.println( "Array'daki en küçük sayı: "+ arr[0]);
        System.out.println( "Array'daki en büyük sayı: "+arr[arr.length - 1]);
    }
}
