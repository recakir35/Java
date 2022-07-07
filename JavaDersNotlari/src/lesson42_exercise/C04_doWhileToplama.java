package lesson42_exercise;

import java.util.Scanner;

public class C04_doWhileToplama {
    public static void main(String[] args) {
        //Kullanicidan toplamak icin sayi isteyin ve toplam 500’e ulasincaya kadar devam
        //istemeyi ettirin. Toplam 500’e ulastiginda veya gectiginde toplami ve kac sayi
        //girildigini yazdirin

        Scanner scan = new Scanner(System.in);
        int toplam=0;
        int sayac=0;

        do {
            System.out.print("Lütfen Bir Tamsayı giriniz Giriniz: ");
            int sayi = scan.nextInt();
            toplam+=sayi;
            sayac++;
        }while(toplam<=500);
        System.out.println( sayac +" kez sayı girdiniz");
        System.out.println( "Girilen Sayıların Toplamı: "+toplam);
    }
}

