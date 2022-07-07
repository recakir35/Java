package day48_collections;

import java.util.HashSet;
import java.util.Set;

public class C02_Hash {
    public static void main(String[] args) {
        String str="Java Çok Güzel";

        System.out.println(str.hashCode());//-863938799

        String str1="Hava Çok Güzel";
        System.out.println(str1.hashCode()); //147178451

        Set<Integer> sayiKumesi = new HashSet<>();
        System.out.println(sayiKumesi.hashCode());//0

        sayiKumesi.add(10);
        System.out.println(sayiKumesi.hashCode());//10
        sayiKumesi.add(20);
        System.out.println(sayiKumesi.hashCode());//30
    }
}
