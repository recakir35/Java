package lesson09_stringManipulation;

import java.util.Scanner;

public class Q03_IsimKisaltarakYaz {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
         Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Üç Kelimelik Bir İsim Giriniz: ");
        String isim=scan.nextLine();
        int bosluk1=isim.indexOf(" ");
        int bosluk2=isim.indexOf(" ",bosluk1+1);

        System.out.println("Girilen İsim: "+isim);
        System.out.println("Kısaca: "+ isim.charAt(0)+"."+isim.charAt(bosluk1+1)+"."+isim.charAt(bosluk2+1)+".") ;

    }
}
