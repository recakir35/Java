package lesson10_stringManipulation;

import java.util.Scanner;

public class C03_equlsIgnoreCase {
    public static void main(String[] args) {
        // kullanıcıdan derse katılıp katılmayacağını sorun
        //evet derse " derse katılımınız alınmıştır" yazdırın
        // hayır derse cevabını ve " Sonraki derslerimize bekleriz" yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("Derse Katılmak İstermisiniz ? \nEvet veya Hayır yazınız: ");
        String cevap=scan.next();

        if(cevap.equalsIgnoreCase("evet")) {
            System.out.println("Cevabınız: "+ cevap + " derse katılımınız onaylanmıştır");
        } else if(cevap.equalsIgnoreCase("hayır")) {
            System.out.println("Cevabınız: "+ cevap + " sonraki derslere bekleriz");
        }else {
            System.out.println("Lütfen evet veya hayır yazınız");
        }

    }
}
