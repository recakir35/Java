package lesson08_switch_StringManipulation;

import java.util.Scanner;

public class Q04_YuzGunSonraHangiGun {
    public static void main(String[] args) {

        // Kullanıcının yaşadığı güne göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi hafta başlangıcı

        Scanner scan = new Scanner(System.in);
        System.out.print("Pazartesi: 1\nSalı: 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: 6\nPazar: 7\nLütfen Haftanın Kaçıncı Gününde olduğunuzu yazınız: ");
        int kacinciGun = scan.nextInt();
        System.out.print("Kaçgün Sonrasını Öğrenmek İstiyorsunuz: ");
        int kacGunSonrasi = scan.nextInt();
        int bulunanGun = (kacGunSonrasi + kacinciGun) % 7;

        if (kacinciGun <= 0 || kacinciGun > 7) {
            System.out.println("Hatalı veri girdiniz");
        } else

        switch (bulunanGun) {
            case 1:
                System.out.println(kacGunSonrasi + " gün sonrası günlerden PAZARTESİ");
                break;
            case 2:
                System.out.println(kacGunSonrasi + " gün sonrası günlerden SALI");
                break;
            case 3:
                System.out.println(kacGunSonrasi + " gün sonrası günlerden ÇARŞAMBA");
                break;
            case 4:
                System.out.println(kacGunSonrasi + " gün sonrası günlerden PERŞEMBE");
                break;
            case 5:
                System.out.println(kacGunSonrasi + " gün sonrası günlerden CUMA");
                break;
            case 6:
                System.out.println(kacGunSonrasi + " gün sonrası günlerden CUMARTESİ");
                break;
            case 0:
                System.out.println(kacGunSonrasi + " gün sonrası günlerden PAZAR");
                break;
            default:
                System.out.println("Hafta 7 Gün");
        }

    }
}

