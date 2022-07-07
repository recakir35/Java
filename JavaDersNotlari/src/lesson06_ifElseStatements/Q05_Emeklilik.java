package lesson06_ifElseStatements;

import java.util.Scanner;

public class Q05_Emeklilik {
    public static void main(String[] args) {
        //Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Cinsiyetinizi Yazınız " + "\nKadın İçin: K \nErkek İçin: E");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("Lütfen Yaşınızı Giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet == 'K') {

            if (yas < 0 || yas > 120) {
                System.out.println("Lütfen girdiğiniz yas değerini kontrol edin");
            } else if (yas < 60) {
                System.out.println("Emekli Olamazsın\nDaha " + (60 - yas) + " yıl çalışman gerek");
            } else {
                System.out.println("Emekli olabilirsin");
            }

        } else if (cinsiyet == 'E') {

            if (yas < 0 || yas > 120) {
                System.out.println("Lütfen girdiğiniz yas değerini kontrol edin");
            } else if (yas < 65) {
                System.out.println("Emekli Olamazsın\nDaha " + (65 - yas) + " yıl çalışman gerek");
            } else {
                System.out.println("Emekli olabilirsin");
            }

        } else
            System.out.println("Lütfen Cinsiyet İçin Geçerli bir harf giriniz");
    }
}
