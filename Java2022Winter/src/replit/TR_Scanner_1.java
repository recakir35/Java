package replit;

import java.util.Scanner;

public class TR_Scanner_1 {
    public static void main(String[] args) {
        //Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz: ");
        int sayi=scan.nextInt();

        System.out.println("Sayının Küpünün Yarısı: "+((sayi*sayi*sayi)/2));
    }
}
