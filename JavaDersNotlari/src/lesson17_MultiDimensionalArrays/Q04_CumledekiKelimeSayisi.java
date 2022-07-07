package lesson17_MultiDimensionalArrays;

import java.util.Scanner;

public class Q04_CumledekiKelimeSayisi {
    public static void main(String[] args) {
        //Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütefen Bir Cümle Giriniz: ");
        String cumle=scan.nextLine();

        String arr[]=cumle.split(" ");
        System.out.println("Girdiğiniz Cümledeki Kelime Sayısı: "+arr.length);
    }
}
