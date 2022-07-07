package day11_stringManipulation;

import java.util.Locale;

public class C01_toLowerCase_toUpperCase {
    public static void main(String[] args) {
        String str="Java Güzeldir";
        // Biz String metotlarını arka arkaya kullanabiliriz
        // mesala ikinci kelimenin ilk harfini küçük yazdıralım
        //str.charAt(5); böyle yazdığımız da sonuç artık char olacaktır
        // dolayısıyla stringde yapmak istediğimiz tüm değişikleri önce yapıp sonra charAt metodunu kullanmalıyız

        System.out.println(str.toLowerCase().charAt(5));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));
    }
}
