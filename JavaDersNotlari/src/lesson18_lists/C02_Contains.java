package lesson18_lists;

import java.util.ArrayList;
import java.util.List;

public class C02_Contains {
    public static void main(String[] args) {
        List<String> harfler = new ArrayList<>();
        harfler.add("D"); // [D]
        harfler.add("M"); // [D, M]
        harfler.add(1, "T"); // [D, T, M] - İndex 1 'e "T" harfi ekliyor
        harfler.add(0, "T"); // [T, D, T, M]
        System.out.println(harfler);
        System.out.println(harfler.contains("T")); //  Harfler listesi "T" İçerirmi? - true
        System.out.println(harfler.contains("F"));//  Harfler listesi "F" İçerirmi? - false
        List<String> karakterler = new ArrayList<>(); // yeni bir Arraylist oluşturuluyor
        karakterler.add("M"); // M ekleniyor
        karakterler.add("T"); // T ekleniyor
        System.out.println(harfler.containsAll(karakterler)); // harfler Arraylisti Karakterler Araylistinin tüm elemanlarını içerirmi? -true
        karakterler.add("F");
        System.out.println(harfler.containsAll(karakterler)); // harfler Arraylisti Karakterler Araylistinin tüm elemanlarını içerirmi? -false
    }
}