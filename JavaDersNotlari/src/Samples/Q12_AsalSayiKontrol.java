package practice_free2;

import java.util.Scanner;

public class Q12_AsalSayiKontrol {
    /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = scan.nextInt();
boolean asalSayiMi=true;

        for (int i = 2; i < sayi ; i++) {
            if (sayi%i==0){
                asalSayiMi=false;
            }
        }
if (asalSayiMi){
    System.out.println(sayi+" Bir asal sayıdır.");
}else System.out.println(sayi+" Bir asal sayı DEĞİLDİR.");
    }

}
