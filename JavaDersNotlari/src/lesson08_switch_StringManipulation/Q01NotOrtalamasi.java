package lesson08_switch_StringManipulation;

import java.util.Scanner;

public class Q01NotOrtalamasi {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanıcıdan notunu alın ve aşağıdaki kurallara göre console'a A, B, C veya D yazdırın.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
		
		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.

		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Noutunuzu Giriniz:");
        int not = scan.nextInt();
        int deger;

        deger = (not >= 0 && not < 50) ? 1 : (not >= 50 && not < 60) ? 2 : (not >= 60 && not < 80) ? 3 : (not >= 80 && not <=100) ? 4 : -1;

        switch (deger) {

            case 1:
                System.out.println("D");
                break;
            case 2:
                System.out.println("C");
                break;

            case 3:
                System.out.println("B");
                break;
            case 4:
                System.out.println("A");
                break;
            default:
                System.out.println("Yanlış not girdiniz");
        }
    }
}