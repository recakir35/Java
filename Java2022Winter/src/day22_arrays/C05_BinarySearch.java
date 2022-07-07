package day22_arrays;

import java.util.Arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {

        // verilen array'de istenen bir elementin var olup olmadığını true false yazdırarak göesteren bir metot oluşturun

        int arr[] = {3, 5, 6, 1, 9, 0, 45, 25, 4, 9, 0};
        int istenenSayi = 0;

        istenenElemanVarmi(arr, istenenSayi);

    }

    private static void istenenElemanVarmi(int[] arr, int istenenSayi) {
boolean sonuc=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == istenenSayi) {
                sonuc = true;
                break;
            }
        }
        System.out.println(sonuc);
    }
}
