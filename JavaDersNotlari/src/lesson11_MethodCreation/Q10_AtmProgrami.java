package lesson11_MethodCreation;

import java.util.Scanner;

public class Q10_AtmProgrami {
    static int bakiye = 1000;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /*
  Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma
  ve cekme, çıkış işlemlerinin yapıldıgı bir
   ATM app. method create ediniz
   */

        System.out.println("1- Bakiye Sorgulama\n2- Para Çekme\n3- Para Yatırma\n4- Çıkış");
        secim();


    }

    private static void secim() {
        System.out.print("Yapacağınız İşlemi Seçiniz: ");
        int islemSec = scan.nextInt();

        switch (islemSec) {
            case 1:
                bakiyeSorgulama();
                break;
            case 2:
                paraCekme();
                break;
            case 3:
                paraYatırma();
                break;
            case 4:
                cıkıs();
                break;
            default:
                System.out.println("Yanlış Seçim yaptınız. Tekrar Deneyiniz");
        }
    }

    private static void cıkıs() {
        System.out.println("\nGüle güle... Yine Bekleriz");
    }

    private static void paraYatırma() {
        System.out.print("\nLütfen Yatırmak istediğiniz meblağı giriniz: ");
        int paraYatırma = scan.nextInt();
        if (paraYatırma < 0) {
            System.out.print("Lütfen sıfırdan büyük bir meblağ giriniz: ");
        } else {
            bakiye += paraYatırma;
            System.out.println("İşleminiz Tamamlanmıştır.");
            System.out.print("\nBaşka İşlem Yapmak İstiyorsanız 1 İstemiyorsanız 0 basınız: ");
            int secim = scan.nextInt();

            if (secim == 1) {
                secim();
            } else if (secim==0){
                cıkıs();
            }else{
                System.out.println("Yanlış seçim yaptınız");
                secim();
            }
        }

    }

    private static void paraCekme() {
        System.out.print("\nLütfen Çekmek istediğiniz meblağı giriniz: ");
        int paraCekme = scan.nextInt();
        if (paraCekme < 0) {
            System.out.print("Lütfen sıfırdan büyük bir meblağ giriniz: ");
        } else if (bakiye < paraCekme) {
            System.out.println("Bakiyeniz: " + bakiye + " TL");
            paraCekme();
        } else {
            bakiye -= paraCekme;
            System.out.println("Paranızı alabilirsiniz.");
            System.out.print("\nBaşka İşlem Yapmak İstiyorsanız 1 İstemiyorsanız 0 basınız: ");
            int secim = scan.nextInt();

            if (secim == 1) {
                secim();
            } else if (secim==0){
                cıkıs();
            }else{
                System.out.println("Yanlış seçim yaptınız");
                secim();
            }
        }

    }

    private static void bakiyeSorgulama() {
        System.out.println("Bakiyeniz: " + bakiye + " TL.");
        System.out.print("\nBaşka İşlem Yapmak İstiyorsanız 1 İstemiyorsanız 0 basınız: ");
        int secim = scan.nextInt();

        if (secim == 1) {
            secim();
        } else if (secim==0){
            cıkıs();
        }else{
            System.out.println("Yanlış seçim yaptınız");
            secim();
        }
    }


}



