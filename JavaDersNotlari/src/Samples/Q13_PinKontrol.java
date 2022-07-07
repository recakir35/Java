package practice_free2;

import java.util.Scanner;

public class Q13_PinKontrol {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pin = "Recep.495";
        int girisHakki = 3;
        int sayac = 1;

        while (girisHakki >= sayac) {
            System.out.print("Lütfen pini giriniz: ");
            String pingiris= scanner.next();

            if (pin.equalsIgnoreCase(pingiris)){
                System.out.println("Gayet Başarılı şifre doğru.");
                break;
            }else {
                System.out.println("Yanlış pin girdiniz");
                if (girisHakki-sayac>0) {
                    System.out.println(girisHakki - sayac + " Pin giriş hakkınız kaldı.\n");
                    sayac++;
                }else {
                    System.out.println(sayac+". kez girdiğiniz şifre yanlıştır. Güle Güle....\n");
                    break;
                }
            }
        }
    }
}
