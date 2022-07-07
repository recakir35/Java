package day10_switch_StringManipulation;

import java.util.Locale;

public class C04_charAt {
    public static void main(String[] args) {
        // String'de herhangi bir harfi almak istediğimizde o harfin indexsini kullanarak
        // str.charAt(istenenIndex) yazabiliriz

        String str = "Java Cok Güzel";
        // J yi yazdırmak
        System.out.println(str.charAt(0));
        // G'yi yazdırmak
        System.out.println(str.charAt(9));
        //va yazdıralım
        System.out.println("" + str.charAt(2) + str.charAt(3));
        //cOK şeklinde yazdıralım
        System.out.println("" + str.toLowerCase().charAt(5) + str.toUpperCase().charAt(6) + str.toUpperCase().charAt(7));
        // son harfi yazdır
        System.out.println(str.charAt(14 - 1)); // uzunluk - 1


    }
}
