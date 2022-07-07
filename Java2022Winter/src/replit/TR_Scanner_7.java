package replit;

import java.util.Scanner;

public class TR_Scanner_7 {
    public static void main(String[] args) {
        //Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Bir Float Sayı Giriniz: ");
        double sayi=scan.nextDouble();
        System.out.println((int)sayi);
    }
}
