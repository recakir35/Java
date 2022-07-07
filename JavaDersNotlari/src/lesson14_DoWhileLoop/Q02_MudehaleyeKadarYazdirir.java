package lesson14_DoWhileLoop;

import java.util.Scanner;

public class Q02_MudehaleyeKadarYazdirir {
    /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean sart = false;

        do {
            System.out.print("Bir String Giriniz(Çıkış için x' basınız): ");
            String str = scan.nextLine();
            if (str.toLowerCase().equals("x")) sart = true;
        } while (sart==false);
    }

}
