package lesson40_collections;

import java.util.HashSet;
import java.util.Set;

public class Ex01_ {

    /* TASK:
parametresi Integer set ve integer array ve adi elementEkle
olan array elemanalrı set'e convert edn bir method create ediniz .
yine set icindekileri yazdiracak ayrica bir metod daha create edip print ediniz.
 */
    public static void main(String[] args) {
        Integer arr[] = {1, 2, 3};
        elementEkle(arr);
    }

    private static void elementEkle(Integer[] arr) {
        Set<Integer> arrSet = new HashSet<Integer>();

        for (Integer each:arr){
            arrSet.add(each);
        }
        setYazdir(arrSet);
    }

    private static void setYazdir(Set<Integer> arrSet) {
        System.out.println(arrSet);
    }
}