package lesson35_Exceptions.Ex01_VizeFinal_;

import java.util.Scanner;

public class Ex01_VizeFinal {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean tekrarGir = false;
        int v = 0;
        int f = 0;

        do {
            tekrarGir = false;
            System.out.print("Vize Notunu giriniz: ");
            try {
                v = scan.nextInt();
                if (v < 0 || v > 100) {
                    throw new ArithmeticException();
                }
            } catch (ArithmeticException e) {
                System.out.println("Vize Notu 0-100 arasında olmalıdır.");
                tekrarGir = true;
            } catch (Exception e) {
                scan.nextLine();// dummy
                System.out.println("Lütfen Rakamsal bir vize notu giriniz.");
                tekrarGir = true;
            }

        } while (tekrarGir);

        do {
            tekrarGir = false;
            System.out.print("Final Notunu giriniz: ");
            try {
                f = scan.nextInt();
                if (v < 0 || v > 100) {
                    throw new ArithmeticException();
                }
            } catch (ArithmeticException e) {
                System.out.println("Final Notu 0-100 arasında olmalıdır.");
                tekrarGir = true;
            } catch (Exception e) {
                scan.nextLine();// dummy
                System.out.println("Lütfen Rakamsal bir final notu giriniz.");
                tekrarGir = true;
            }

        } while (tekrarGir);

        System.out.println("Ortalama= "+ortalamaHesaplama(v, f));
    }

    private static double ortalamaHesaplama(int v, int f) {
        double ortalama = 0;
        ortalama = v * 0.40 + f * 0.60;

        return ortalama;
    }


}
