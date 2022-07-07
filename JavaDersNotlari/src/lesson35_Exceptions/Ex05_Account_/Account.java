package lesson35_Exceptions.Ex05_Account_;

import java.util.Scanner;

public class Account {
    static Scanner scan = new Scanner(System.in);
    static String accountNumber;
    static double balance = 1000;

    public static void paraEkle() {
        System.out.println("   ***   PARA YATIRMA   ***   ");
        System.out.print("Lütfen Eklenecek Miktarı Giriniz: ");
        double eklenenMiktar = scan.nextDouble();
        balance += eklenenMiktar;           // Yatırılan para ekleniyor
        System.out.println("Bakiye= " + balance);  // Bakiye gösteriliyor.
    }

    public static void paraCikar() {
        boolean kontrol = false;
        double cekilenMiktar = 0;
        while (true) {
            kontrol = false;
            System.out.println("   ***   PARA ÇEKME   ***   ");
            System.out.print("Lütfen Çekilecek Miktarı Giriniz: ");

            try {
                cekilenMiktar = scan.nextDouble();
                if (cekilenMiktar > balance) { // Çekilen Miktar bakiyeden büyükse exception fırlatıyor.
                    throw new IllegalArgumentException(); // Exception fırlatma- Geçersiz Argüman İstisnası-
                }
            } catch (Exception e) {
                System.out.println("Çekilen Miktar Bakiyeden büyük olamaz. Bakiye= " + balance);
                kontrol = true;
            }
            if (!kontrol) break;
        }
        balance -= cekilenMiktar;
        System.out.println("İşleminiz Yapılıyor.. Paranızı almadan ayrılmayın... Kalan Bakiye= " + balance);

    }

    public static void cikis() {
        System.out.println("Yine bekleriz....");
    }
}
