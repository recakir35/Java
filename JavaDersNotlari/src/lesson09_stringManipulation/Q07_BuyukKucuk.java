package lesson09_stringManipulation;

import java.util.Scanner;

public class Q07_BuyukKucuk {
    public static void main(String[] args) {
        // Kullanicidan bir cumle isteyin Cumle "büyük" kelimesi iceriyorsa tum
        //cumleyi buyuk harf olarak,olarak,"küçük" kelimesi iceriyorsa tum cumleyi kucuk harf olarak
        //yazdirin, iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor”
        //yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Cümle Giriniz: ");
        String cumle=scan.nextLine().toUpperCase();

        if (cumle.contains("BÜYÜK")){
            System.out.println("Yazılan Cümle: "+cumle);
        }else if(cumle.contains("KÜÇÜK")){
            System.out.println("Yazılan Cümle: "+cumle.toLowerCase());
        }else System.out.println("Yazılan Cümle kucuk yada buyuk kelimesi icermiyor: ");

    }
}
