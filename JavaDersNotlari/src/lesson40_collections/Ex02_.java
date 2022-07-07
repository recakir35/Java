package lesson40_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex02_ {

    /*  Method:
           10 ve 5 elemanli, elemanlari 0-20 arasinda değer alan 2 adet  ArrayList create edin ve
        elemanlarini aldigi min, max degerleri arasindaki random sayi ile doldurup
        sonucta bir ArrayList return eden bir method yaziniz
        main:
        1.  Yazdiginiz Methodu kullanarak bir 10 ve 5 elemanli
            elemanlari 0-20 arasinda 2 adet ArrayList olusturun
        2.  Bu iki list'in ortak elemanlarini bulunuz
        3.  Bu iki list'in farkli olan elemanlarini bulunuz
        4.  Bu listleri birbirine ekleyip önce kücükten büyüge sonra ters siralayiniz

     */


    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        arrayListOlustur(10, 0, 20);// Array oluşturma Methodu

        // 1.  Yazdiginiz Methodu kullanarak bir 10 ve 5 elemanli elemanlari 0-20 arasinda 2 adet ArrayList olusturun
        list1 = arrayListOlustur(10, 0, 20);
        list2 = arrayListOlustur(5, 0, 20);
        System.out.println("List1= "+list1);
        System.out.println("List2= "+list2);

        // 2.  Bu iki list'in ortak elemanlarini bulunuz.
        List<Integer> depoList = new ArrayList<>();
        for (int each: list1){
            if (list2.contains(each)){
                depoList.add(each);
            }
        }
        System.out.println("Ortak List= "+ depoList);

        // 3.  Bu iki list'in farkli olan elemanlarini bulunuz
        List<Integer> depoList1 = new ArrayList<>();
        for (int each: list1){
            if (!list2.contains(each)){
                depoList1.add(each);
            }
        }
        System.out.println("Ortak Olmayan List= "+depoList1);

        //4.  Bu listleri birbirine ekleyip önce kücükten büyüge sonra ters siralayiniz

        List<Integer> depoList2 = new ArrayList<>();
        for (int each: list1) depoList2.add(each); // list1 'i depoList2'ye atıyor
        for (int each: list2) depoList2.add(each); // list2 'i depoList2'ye atıyor
        Collections.sort(depoList2); // Küçükten büyüğe sıralama
        System.out.println("Küçükten Büyüğe: "+depoList2);
        List<Integer> depoList3 = new ArrayList<>();

        for (int i = depoList2.size()-1; i >=0; i--) depoList3.add(depoList2.get(i));

        System.out.println("Büyükten Küçüğe: "+depoList3);
    }



    public static List<Integer> arrayListOlustur(int size, int min, int max) {
        List<Integer> list = new ArrayList<>();
        for (int i = min; i < size; i++) { // verilen Min değerinden başlayıp size değerine kadar dönerek
        list.add((int) (Math.random()*20)); // rastgele 0 ile 20 arasındaki sayı, üretilen sayı double olduğundan int'e cast edilmiştir.
        }
        return list;
    }
}
