package day13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {
        String str = "Java ile IT çok güzel";

        System.out.println(str.substring(5));

        // yukarıdaki Stringi Mehmet hoca ile IT çok güzel
        System.out.println(str.replace("Java", "Mehmet Hoca"));
        System.out.println("mehmet Hoca " + str.substring(5));
        System.out.println(str.substring(9));// yazılan index inclusive

        // belirli bir parçayı almak için 2 parametre almak gerek
        // str.substring(başlamaİndexi,bitisIndex)

        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(0, 1));

        str = "Java gun gectikçe güzalleşiyor";

        System.out.println(str.substring(7, 7)); //Hiçlik""

        // System.out.println(str.substring(5,2)); // Bitiş index başlangıç indexsinden küçük olamaz
        System.out.println(str.substring(str.length() - 1));
        System.out.println(str.substring(str.length() - 5)); // son 5 harfi yazdıralım
        System.out.println(str.substring(str.length())); // son harfden sonra hiçlik verir
    }
}
