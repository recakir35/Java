package lesson42_exercise;

import java.util.Scanner;

public class TR_Scanner_9 {
    public static void main(String[] args) {
        //Girilen zamanı saniyeye çeviren bir program yazınız.
        //
        //
        //Örnek Çıktı:
        //
        //1 saat 10 dakika 50 saniye ==>
        //
        //4250 saniye
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen saat Giriniz: ");
        int saat=scan.nextInt();
        System.out.print("Lütfen dakika Giriniz: ");
        int dakika=scan.nextInt();
        System.out.print("Lütfen saniye Giriniz: ");
        int saniye=scan.nextInt();

        System.out.println(saat+ " Saat "+dakika+" dakika "+saniye+" saniye ==>");
        System.out.println((saat*3600+dakika*60+saniye)+" saniye");
    }
}
