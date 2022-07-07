package practice_basic_day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q03_DiziElemanlari {
    // String[] list = {"fruits", "vegetables", "meat", "milk"};
    // print array with for each loop
    // print length of each element

    // Part 2:
    // Print all the elements from array using for eachLoop
    // If an element starts with 'v' then quit the loop
    public static void main(String[] args) {

        String list[] = {"fruits", "vegetables", "meat", "milk"};
        List<Integer> listSize=new ArrayList<>();
        List<String> vsizList=new ArrayList<>();
        for (String each: list){
            listSize.add(each.length());// Dizideki Her elemanın uzunluğunu bir listeye atıyor.
        }
        System.out.println("Dizinin Baskı uzunluğu:"+listSize); // Dizi Elemanlarının Uzunlukları Yazdırılıyor.
        System.out.println("Dizi Elemanları: "+Arrays.toString(list)); // Dizi Elemanları yazdırılıyor

        for (String each: list){
            if (each.startsWith("v")){
                System.out.println("Dizinin '"+ each+ "' elemanı 'v' ile başladığından diziden çıkılıyor...");
                System.out.println("Şimdiye Kadar Yazdırılan Dizi elemanları: "+ vsizList);
                break;
            }
            vsizList.add(each);
        }
    }
}
