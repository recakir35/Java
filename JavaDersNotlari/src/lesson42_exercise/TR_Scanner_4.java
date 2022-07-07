package lesson42_exercise;

import java.util.Scanner;

public class TR_Scanner_4 {
    public static void main(String[] args) {
        //Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.
        //
        //
        //1 şeker = 1.7 gr
        //
        //
        //Örnek Çıktı:
        //
        //Yılda 12.41 kg şeker kullanıyor.
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir Günde Ne Kadar Çay İçtiğinizi Giriniz: ");
        int cay=scan.nextInt();
        System.out.print("Bir Bardağa Ne Kadar Şeker Kullanıyorsunuz Giriniz: ");
        int seker=scan.nextInt();

        System.out.println("Yilda "+ ((cay*seker*360)*1.7/1000)+" kg seker kullaniyor");
    }
}
