package lesson09_stringManipulation;

import java.util.Scanner;

public class Q10_TerstenYazdırma {
    public static void main(String[] args) {
        //Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("4 Harfli bir Kelime Giriniz: ");
        String kelime = scan.nextLine();
        String tersKelime;

        if (kelime.length() - 1 == 3) {
            tersKelime = kelime.substring(3) +
                    kelime.substring(2, 3) +
                    kelime.substring(1, 2) +
                    kelime.substring(0, 1);
            System.out.println(tersKelime);
        } else System.out.println("Lütfen İstenen Şartlarda bir Kelime giriniz.");
    }
}
