package lesson08_switch_StringManipulation;

import java.util.Scanner;

public class Q03_AyinGunleri {
    public static void main(String[] args) {

// Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Ay Numarası giriniz: ");
        int ay = scan.nextInt();

        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Seçilen Ayda 31 Gün vardır");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Seçilen Ayda 30 Gün vardır");
                break;
            case 2:
                System.out.print("Lütfen bulunduğunuz yılı giriniz: ");
                int yil=scan.nextInt();
                if (yil%4==0){
                    System.out.println("Seçilen Ayda 29 Gün vardır");
                }else  System.out.println("Seçilen Ayda 28 Gün vardır");
                break;

            default:
                System.out.println("Yanlış Ay Numarası girdiniz");
        }

    }
}

