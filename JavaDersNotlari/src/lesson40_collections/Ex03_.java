package lesson40_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex03_ {
    /* TASK:

        1.  30 elemanli, elemanlari 0-10 arasinda random sayilardan olusan bir arraylist create edin.
        2.  1. adımdaki arraylist print edin.
        3.  bu arrayin tekrar eden elemanlarini arrayden silen methodu create edin.
        4.  sonucu print edin
        5.  Basta hazirlanan arraylist'i Set'e cevirin
        6.  Hazirlanan bu Set'i de Arraylist'e cevirin

     */

    public static void main(String[] args) {
        // 1.  30 elemanli, elemanlari 0-10 arasinda random sayilardan olusan bir arraylist create edin.
        List<Integer> list = new ArrayList<Integer>();
        list=Ex02_.arrayListOlustur(30,0,10); //Ex02_ Clasında oluşturulan bir methodu çağırdık.

        //2.  1. adımdaki arraylist print edin.
        System.out.println("List= "+list);

        //3.  bu arrayin tekrar eden elemanlarini arrayden silen methodu create edin.
        tekrarSizList(list);
        //4.  sonucu print edin
        System.out.println("Tekrarsız List= "+tekrarSizList(list));
        //5.  Basta hazirlanan arraylist'i Set'e cevirin
        Set<Integer> setList = new HashSet<Integer>();
        for (int each:list){
            setList.add(each);
        }
        System.out.println("Set List= "+setList);

       // 6.  Hazirlanan bu Set'i de Arraylist'e cevirin
        List<Integer> yeniList = new ArrayList<Integer>();
        for (int each:setList){
            yeniList.add(each);
        }
        System.out.println("Array List= "+yeniList);
    }

    private static List<Integer> tekrarSizList(List<Integer> list) {
        List<Integer> tekrarsizList = new ArrayList<Integer>();
        for (int each: list){
            if (!tekrarsizList.contains(each)) tekrarsizList.add(each);
        }
        return list;
    }
}

