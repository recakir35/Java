package lesson42_exercise;

import java.util.Scanner;

public class TR_If_Switch_Ternary_2 {
    public static void main(String[] args) {
        //Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.
        //
        //Input :
        //
        //John White
        //
        //1234234534561478
        //
        //Output : Name :
        //
        //J* W**
        //
        //CCN : ** ** **** 1478
        //
        //Ilk Harfler Buyuk harf ile baslamalidir.
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Adınızı ve Soyadınızı Giriniz: ");
        String adSoyad= scan.nextLine();
        System.out.print("Lütfen Kredi Kart No Giriniz: ");
        String kartNo = scan.nextLine();

        String ad=adSoyad.substring(0,adSoyad.toUpperCase().lastIndexOf(" ",adSoyad.length()-1));
        String soyAd= adSoyad.substring((adSoyad.toUpperCase().lastIndexOf(" ",adSoyad.length()-1))+1);

        System.out.println(ad.substring(0,1).toUpperCase()+ad.substring(1).replaceAll("\\D","*")+" "+
                soyAd.substring(0,1).toUpperCase()+soyAd.substring(1).replaceAll("\\D","*"));
        System.out.println("CCN : **** **** **** "+kartNo.substring(kartNo.length()-5));



    }
}
