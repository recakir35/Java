package day11_stringManipulation;

import java.util.Scanner;

public class C05_indexOf {
    public static void main(String[] args) {
        String str1 = "Java bir başka güzel valla çok güzel";
        // istersek char olarak verdiğimiz bir harfin indexini bize döndürür
        System.out.println(str1.indexOf('J')); // 0
        //istersek bir harf yada metin olarak verdiğimiz String'in indexini döndürür
        System.out.println(str1.indexOf("l"));// 19
        System.out.println(str1.length() - 1); // 35
        System.out.println(str1.indexOf("aşka")); //10

        // aynı harfden birden fazla varsa
        System.out.println(str1.indexOf("b")); // bulduğu ilk doğrunun indexsini döndürür

        //
        System.out.println(str1.indexOf('b', 5)); // 5
        //bu method'a java aramayı fromindex'den başlar(inclusive)

        // verilen stringdeki 2.a harfinin indexini bulalım

        int ilkindex = str1.indexOf('a'); // 1
        System.out.println(str1.indexOf('a', ilkindex + 1)); // 3
        int ilkbindex = str1.indexOf('b'); // 1
        System.out.println(str1.indexOf('b', ilkbindex + 1)); // 9

        // 20. indexten sonra güzel aratalım
        System.out.println(str1.indexOf("güzel",20)); //31

        // String'te olmayan bir harf aratsak
        System.out.println(str1.indexOf("y")); // y yok demesi gerek ama return type'i index
        // yok demenin sayısal karşılığı olarak java -1 döndürmeyi tercih etmiştir

        // kullanıcıdan mail adresini isteyin @ işareti içermiyorsa geçersiz yazdırın. içeriyorsa mailiniz kabul edildi yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen mailinizi yazınız: ");
        String mail=scan.next();

        if (mail.indexOf("@")==(-1)){
            System.out.println("Geçersiz");
        } else System.out.println("mailiniz kabul edildi");

        // indexof method'u içersinde yazılan String veya char'in metinde hangi indexte olduğunu bize döndürür
        // yoksa -1 döndürür
    }
}
