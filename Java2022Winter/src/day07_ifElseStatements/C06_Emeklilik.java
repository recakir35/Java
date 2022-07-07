package day07_ifElseStatements;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {
        // kullanıcıdan yaşını isteyin
        // 65 veya daha büyükse emekli olabbilirsin
        // 65 den küçükse emekli olamazsın

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen Yaşınızı Giriniz: ");
        int yas= scan.nextInt();

        if (yas>=65){
            System.out.println("Emekli olabilirsiniz");
        } else {
            System.out.println("Emekli olamazsınız");
            System.out.println(65-yas + " Sene daha çalışmalısın");
        }
        // if else statemwntlarda iki durumdan sadece biri çalışır
        // ikisinin birden çalışma ihtimali yoktur
        // ikisininde çalışmama ihtimali yok.

    }
}
