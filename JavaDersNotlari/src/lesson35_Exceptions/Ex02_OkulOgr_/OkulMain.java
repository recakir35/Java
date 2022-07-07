package lesson35_Exceptions.Ex02_OkulOgr_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OkulMain {
    static List<Ogrenci> studentsList = new ArrayList<>();

    public static void main(String[] args) {
        ogrGiris();

    }

    private static void ogrGiris() {
        Okul shcool = new Okul();           // Okul objesi oluşturuldu
        Scanner scan = new Scanner(System.in);
        System.out.println("\n   ***   "+shcool.getSchoolName()+" Öğrenci Kayıt   ***   ");
        System.out.print("Öğrenci Adı: ");
        String name = scan.nextLine();
        System.out.print("Öğrenci Soyadı: ");
        String surName = scan.nextLine();
        int age = 0;
        boolean kontrol = false;

        while (true) { // Hatasız Öğrenci Yaşı girene kadar döngü devam edecek
            kontrol = false;
            System.out.print("Öğrenci Yaşı: ");

            try {
                age = scan.nextInt();
                if (age < 0 || age > 15) {          // age 0 dan küçük 15 den büyükse hata verecek
                    throw new ArithmeticException();
                }
            } catch (ArithmeticException e) {
                System.out.println("Öğrenci yaşı 0-15 arasında olmalı.");
                kontrol = true;
            } catch (Exception e) {                 // age harf girilirse hata verecek
                scan.nextLine();
                System.out.println("Hatalı yaş bilgisi girdiniz.");
                kontrol = true;
            }
            if (!kontrol) break;        // age bilgisi doğru girilirse döngü kırılıyor.
        }
        if (shcool.getMaxStudentCount() > studentsList.size()) {      // Okul Öğrenci sayısı Kontrol ediliyor.
            Ogrenci student = new Ogrenci(name, surName, age);      // Öğrenci objesi oluşturuluyor.
            studentsList.add(student);                              // Öğrenci Listesine Kayıt yapılıyor.

            System.out.println("\n ***   " + shcool.getSchoolName() + " öğrenci listesi   ***   ");
            int sn=1;
            for (int i = 0; i < studentsList.size(); i++) { // Öğrenci Listesi Oluşturuluyor
                System.out.println(sn+". "+studentsList.get(i));
                sn++;
            }
            ogrGiris();
        } else
            System.out.println("\nÖğrenci Kotasını aştınığınız için kayıt yapılamamıştır. Öğrenci Kotası: " + shcool.getMaxStudentCount() + " Mevcut Öğrenci Sayısı: " + studentsList.size());
    }
}
