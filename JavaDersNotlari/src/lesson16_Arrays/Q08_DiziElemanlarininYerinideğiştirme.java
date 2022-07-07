package lesson16_Arrays;

import java.util.Arrays;

public class Q08_DiziElemanlarininYerinideğiştirme {

    public static void main(String[] args) {
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */
        String str = "HeySiri";

        String arr[]=str.split("y");
        arr[0]="Bye";
        str=arr[0]+arr[1];

        System.out.println(str);

        String yeniArr[]= new String[1];

        yeniArr[0]=str;

        System.out.println(Arrays.toString(yeniArr));


    }
}
