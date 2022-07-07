package lesson42_exercise;

import java.util.Scanner;

public class TR_For_while_2 {
    public static void main(String[] args) {
        /*Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
        Input : 30  40
        Beklenen Cikti:30 ve 40 icin GCD = 10
        Beklenen Cikti:30 ve 40 icin LCM = 120
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 1.Sayıyı Giriniz: ");
        int number1 = scan.nextInt();
        System.out.print("Lütfen 2.Sayıyı giriniz: ");
        int number2 = scan.nextInt();
        int ebob = Integer.MIN_VALUE;
        int ekok = 0;

        for (int i = number1 * number2; i > 0; i--) { // ekok buluyor
            if (i % number1 == 0 && i % number2 == 0) {
                ekok = i;
            }
        }

        for (int i = 1; i <number1; i++) { // ebob buluyor
            if ( number1%i == 0 && number2 %i == 0) {
                ebob = i;
            }
        }
        System.out.println("Ebob: " + ebob);
        System.out.println("Ekok: " + ekok);
    }
}
