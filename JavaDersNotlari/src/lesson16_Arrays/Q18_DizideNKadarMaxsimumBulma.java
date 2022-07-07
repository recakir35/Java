package lesson16_Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q18_DizideNKadarMaxsimumBulma {
    public static void main(String[] args) {

        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */

        int arr[] = {12,10,1,2, 28, 3, 4, 15, 6, 7, 28,12,10};
        int n = 4; // en büyük iki elemanını verir.
        int count=0; // sayac tanımlıyoruz

       List<Integer> list = new ArrayList<>(); // arrayimizi listeye alıyoruz
       List<Integer> yenilist = new ArrayList<>(); // max olan arylarimizi bu listeye atacağız

       for (int each:arr){ // Arr dizimizdeki elemanları listeye atıyoruz
           list.add(each);
       }
        Collections.sort(list); // listemizi sıralatıyoruz
        int max =list.size()-1; // Max değişkenimizi listenin en büyük elemanını atıyoruz

        for (int i = list.size()-1; i >=0; i--) {
            if (count<n && !yenilist.contains(list.get(i))) { //tekrarsız en büyük elemanları yeni liste atıyoruz
               yenilist.add(list.get(i));
                count++;
            }
        }
Collections.sort(yenilist);// yeni list sıralıyoruz
        System.out.println(list);
        System.out.println(yenilist);
       /*
        for (int i = 0; i < n; i++) {

            max[i] = arr[arr.length - sayac];
            System.out.println(i);
            sayac--;
        }
        System.out.println(Arrays.toString(max));

        */
    }

}
