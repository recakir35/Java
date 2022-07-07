package day23_multiDimensionalArrays;

import java.util.Scanner;

public class C07MDArrays {
    public static void main(String[] args) {
        //Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütefen Bir Cümle Giriniz: ");
        String cumle=scan.nextLine();

        String arr[]=cumle.split(" ");
        System.out.println("Girdiğiniz Cümledeki Kelime Sayısı: "+arr.length);
    }
}
