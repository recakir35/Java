package lesson07_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        // ternary ile yapılan tüm işlemler if else ile yapılabilir
        //
        //
        //
        //
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Pozitif bir tam sayı giriniz: ");

        int sayi= scan.nextInt();

        System.out.println(sayi%2==0 ? "Sayı Çift" : "Sayı Tektir");
    }
}
