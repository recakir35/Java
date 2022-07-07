package day08_ifElseIfStatements;

import java.util.Scanner;

public class C10_OdevMaas {
    public static void main(String[] args) {
        //Soru 8) Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap azdirin.
        //Teklif 80.000’in uzerinde ise “Kabul ediyorum” ,
        //60
        //80.000 arasinda ise “Konusabiliriz”,
        //60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Verebileceğiniz Maaşı Giriniz:");
        double maas = scan.nextDouble();

        if (maas < 0) {
            System.out.println("Maaş -(eksi) olamaz");
        } else if (maas > 80000) {
            System.out.println("Kabul ediyorum");
        } else if (maas > 60000 && maas < 80000) {
            System.out.println("Konuşabiliriz");
        } else if (maas<60000){
            System.out.println("Maalesef Kabul edemem");
        }
    }
}
