package lesson06_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class Q10_IfStatement01 {
    /*
     * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen \"Y/N\" birini Giriniz:");
        char kontrol = scan.next().toUpperCase().charAt(0);

        if (kontrol == 'Y'){
            System.out.println("YES");
        } else System.out.println("NO");

    }
}
