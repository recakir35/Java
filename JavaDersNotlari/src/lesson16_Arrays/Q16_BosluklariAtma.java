package lesson16_Arrays;

import java.util.Arrays;

public class Q16_BosluklariAtma {
    public static void main(String[] args) {
     /*
      *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
      *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
      */

        String str="Bu Hayatta Bir Yaşamak Var Birde Yaşamamak";

        str=str.replaceAll("\\s","");
        String arr[]=str.split("");
        System.out.println("Dizi: "+ Arrays.toString(arr));
        System.out.println("Dizinin Karkter sayısı: "+arr.length);

    }
}
