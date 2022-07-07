package lesson10_stringManipulation;

import java.util.Scanner;

public class Q01_CumledeHarf {
    //Soru 1) Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup
    //olmadigini yazdirin

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Cümle Giriniz: ");
        String cumle=scan.nextLine().toUpperCase();

        System.out.println("Lütfen Bir Harf Giriniz: ");
        char harf=scan.next().toUpperCase().charAt(0);

        System.out.println("Girilen Cümle: "+ cumle);
        System.out.print("Girilen harf: "+ harf);

        if (cumle.indexOf(harf)!=-1) {
            System.out.println(" Girilen Cümlede Girilen Harf "+ cumle.indexOf(harf)+".indexte mevcuttur");
        } else System.out.println(" Girilen Cümlede Girilen Harf mevcut DEĞİLDİR");
    }
}
