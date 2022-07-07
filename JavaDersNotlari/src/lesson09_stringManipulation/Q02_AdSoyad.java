package lesson09_stringManipulation;

import java.util.Scanner;

public class Q02_AdSoyad {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen İsim Soyisim Giriniz: ");
        String isimSoyisim=scan.nextLine();
        String isim,soyİsim;

        isim=isimSoyisim.substring(0,isimSoyisim.indexOf(" "));
        soyİsim=isimSoyisim.substring(isimSoyisim.indexOf(" ")).trim();

        System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1));

        System.out.println(soyİsim.substring(0,1).toUpperCase()+soyİsim.substring(1));

    }
}
