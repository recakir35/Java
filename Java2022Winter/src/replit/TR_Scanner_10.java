package replit;

import java.util.Scanner;

public class TR_Scanner_10 {
    public static void main(String[] args) {
        //Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.
        //
        //INPUT:
        //
        //Dakika sayısı: 3456789
        //
        //OUTPUT :
        //
        //3456789 dakika yaklaşık 6 yıl 210 gündür
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen dakika Giriniz: ");
        int dakika=scan.nextInt();
        int gun=(dakika/(24*60));
        int yil=gun/360;

        System.out.println(dakika+" dakika yaklasik "+yil+" yil "+(gun-(yil*360))+" gündür");
    }
}
