package lesson09_stringManipulation;

import java.util.Scanner;

public class Q01_SpaceVarMi {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Bir Metin Giriniz: ");
        String str=scan.nextLine();

        if (str.contains(" ")){
            System.out.println("Girdiğiniz Metin Boşluk İçeriyor");
        }else System.out.println("Girdiğiniz Metin Boşluk İçermiyor.");

    }
}

