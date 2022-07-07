package day25_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C09_ListKomutlari {
    public static void main(String[] args) {
        //1) Elemanlari A, C, E, ve F olan bir String ArrayList olusturup ekrana yazdiriniz.
        List<String> list=new ArrayList<String>();
        list.add("A");
        list.add("C");
        list.add("E");
        list.add("F");
        System.out.println(list);
        //2) indexsiz add( ) methodunu kullanarak, B’yi ekleyiniz. /index’li add( ) methodunu kullanarak, L’yi 1 numarali index’e ekleyiniz.
        //ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, E, F, B.
        list.add("B");
        list.add(1,"L");
        System.out.println(list);
        //3) set( ) methodu kullanarak, E’yi D yapiniz.
        //ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, F, B.
        list.set(3,"D");
        System.out.println(list);
        //4) remove( ) methodu kullanarak, F’yi siliniz. ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, B.
        list.remove("F");
        System.out.println(list);
        //5) sort( ) methodu kullanarak, elemanlari alfabetik siraya diziniz.
        //ArrayList’i ekrana yazdiriniz, list goyle olmali; A, B, C, D, L.
        Collections.sort(list);
        System.out.println(list);
        //6) contains( ) methodu kullanarak, L’nin list’de var oldugunu ve M’nin list’de var olmadigini dogrulayiniz.
        System.out.println(list.contains("D"));
        System.out.println(list.contains("M"));
        //7) size( ) methodu kullanarak, list’in kag eleman oldugunu ekrana yazdiriniz.
        System.out.println("List eleman sayısı: "+ list.size());
        //8) clear( ) methodu kullanarak, list’deki tum elemanlari siliniz.
        list.clear();
        System.out.println(list);
        //9) isEmpty( ) methodu kullanarak, list’deki tum elemanlarin silindigini dogrulayiniz
        System.out.println(list.isEmpty());



    }
}
