package lesson16_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q17_DiziElemanlariniDisardanGirme {
    public static void main(String[] args) {
        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Listenin Uzunluğunu Rakam Olarak Giriniz: ");
        int listUzunluk = scan.nextInt();
        List<Integer> input = new ArrayList<>();

        for (int i = 0; i < listUzunluk; i++) {
            System.out.print("Listenin " + (i + 1) + " .elemanını sayısal olarak giriniz: ");
            input.add(scan.nextInt());
        }
        tekrarlananList(input);
    }

    private static void tekrarlananList(List<Integer> input) {
        List<Integer> inputTekrar= new ArrayList<>();

        for (int i = 0; i <input.size() ; i++) {
            for (int j = i+1; j <input.size() ; j++) {
                if (input.get(i)==input.get(j)){
                    inputTekrar.add(input.get(j));
                }
            }
        }
        System.out.println("List: " + input);
        System.out.println("Tekrarlanan List: "+inputTekrar);
    }
}
