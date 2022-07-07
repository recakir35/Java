package lesson11_MethodCreation;

import java.util.Scanner;

public class Q09_UsluSayi {
    public static void main(String[] args) {
    /*
         TASK :
        powerOfThree isminde bir Parametre olarak int Return tipi boolean method create edin.
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını kontrol edin. 3'ün üssü(kuvveti) ise true, değilse false return edin.
        Örnek 1:
        input: 27
        output: true

        Örnek 2:
        Girdi: 0
        Çıktı: false

     */
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Tam Sayı Giriniz: ");
        int sayi = scan.nextInt();

        if (powerOfThree(sayi)==true){
            System.out.println("Girdiğiniz Sayı Üçün Üssüdür.");
        }else System.out.println("Girdiğiniz Sayı Üçün Üssü değildir");

    }

    private static boolean powerOfThree(int sayi) {
        boolean us=false;

        if (sayi%3==0){
            us = true;
        }else us = false;
     return us;
    }

}
