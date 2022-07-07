package lesson08_switch_StringManipulation;

import java.util.Scanner;

public class Soru_Bankamatik {
    /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("_____  A T M'ye Hoşgeldiniz ______  ");
        System.out.print("1 : Bakiye Sorgulama\n2 : Para Yatırma\n3 : Para Çekme\n4 : Çıkış\nLütfen yapmak istediğiniz işlemin işlem nosunu yazınız: ");
        int islem = scan.next().charAt(0);
        double bakiye = 1000;

        switch (islem) {
            case '1':
                System.out.println("\nBakiyeniz: " + bakiye + " Tl");
                break;
            case '2':
                System.out.print("\nLütfen Yatırmak istediğiniz Miktarı giriniz: ");
                double yatan = scan.nextDouble();
                bakiye += yatan;
                System.out.println("\nİşleminiz Yapılmıştır. Güncel Bakiye: " + bakiye);
                break;
            case '3':
                System.out.print("\nLütfen çekmek istediğiniz Miktarı giriniz: ");
                double cikan = scan.nextDouble();
                if (cikan > bakiye) {
                    System.out.println("\n!!!Yetersiz Bakiye!!!");
                    break;
                }
                bakiye -= cikan;
                System.out.println("\nİşleminiz Yapılmıştır. Güncel Bakiye: " + bakiye);
                break;
            case '4':
                System.out.println("\nTekrar bekleriz");
                break;
            default:
                System.out.println("\n!!!!!Yanlış bir işlem seçtiniz.!!!!!");
        }


    }
}

