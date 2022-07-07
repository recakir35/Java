package exercises;

import java.util.Arrays;

public class C02_ArraysTerstenYazdirma {
    public static void main(String[] args) {
        //Soru1- Verilen 3 elemanli bir array’in tum elemanlarini bir soldaki konuma tasiyacak bir
        //program yazin. Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.
        int arr[] = {1, 2, 3};
        int arrYeni[] = new int[arr.length];
        int j = 1;
        int topla=0;

        for (int i = 0; i < arr.length; i++) {
            arrYeni[arr.length - j] = arr[i];

            System.out.println(arrYeni[arr.length - j]);
            j++;
        }
        System.out.println(Arrays.toString(arrYeni));

        //Soru 2- Verilen bir array’in tum elemanlarini toplayan bir program yazalim.
        for (int i = 0; i <arr.length ; i++) {

            topla+=arr[i];
        }
        System.out.println("Dizi içindeki sayıların Toplamı: " + topla);
    }


}
