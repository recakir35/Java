package day08_ifElseIfStatements;

import java.util.Scanner;

public class C08_OdevUcgen {
    public static void main(String[] args) {
        //Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu
        //birbirine esit ise ekrana “Eskenar ucgen” yazdirin. Diger durumlarda ekrana
        //“Eskenar degil”

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Üçgenin 1. Kenar Uzunluğunu Giriniz: ");
        int kenar1=scan.nextInt();
        System.out.println("Lütfen Üçgenin 2. Kenar Uzunluğunu Giriniz: ");
        int kenar2=scan.nextInt();
        System.out.println("Lütfen Üçgenin 3. Kenar Uzunluğunu Giriniz: ");
        int kenar3=scan.nextInt();

        if (kenar1<0 || kenar2<0 || kenar3<0) {
            System.out.println("Lütfen pozitif sayı giriniz");
        }else if (kenar1==kenar2 && kenar1==kenar3 && kenar2==kenar3){
            System.out.println("Bu Bir Eşkenar Üçgendir");
        }else System.out.println("Eşkenar Üçgen DEĞİLDİR");
    }
}
