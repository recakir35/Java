package lesson08_switch_StringManipulation;

import java.util.Scanner;

public class Q09_HaftaninGunu {
    //Kullanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Haftanın Kaçıncı Günü Olduğunu Yazın: ");

        int haftagun=scan.nextInt();

        switch (haftagun) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Yanlış bir sayı girdiniz");

        }
    }
}
