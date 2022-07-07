package lesson25_varargs;

import java.util.Scanner;

public class Q02_GirilenTumSayilariToplama {
static int toplam;
    // istedigimiz kadar sayi girdigiimizde
    // toplamlari bize veren bir method yazalim...
    public static void main(String[] args) {
        // Not ; Var-args ---> Arguman cesitliligi
        // Var --->variety args--->arguments
Scanner scan = new Scanner(System.in);
int sayi=1;
int girilensayiadedi=0;
while (sayi>0){
    System.out.println("Sayıların toplamı için 0'a basınız"+"\nİstediğiniz kadar sayı giriniz: ");

if (sayi!=0){
    sayi= scan.nextInt();
    girilensayiadedi++;
}else break;

}
        sayiToplama(sayi);
    }

    private static void sayiToplama(int...sayi) { // varargs 3 noktadan anlıyoruz
        toplam=0;
        for (int each :sayi){
            toplam+=each;
        }
        System.out.println(toplam);
    }


}
