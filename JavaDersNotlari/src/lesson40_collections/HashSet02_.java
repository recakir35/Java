package lesson40_collections;


import java.util.*;

public class HashSet02_ {
    public static void main(String[] args) {
/*
 İcinde degerleri olan bir array i arraylist e cevirecek
    return tipi arrayList olacak bir metod yaziniz.
    {"reha", "hakan", "haluk", "ipek", "ahsen"}

    main metod altinda metod ile gelen listeyi kullanarak
     HashSet, TreeSet ve linkedHashSet leri doldurun.
 */

        String arr[] = {"reha", "hakan", "haluk", "ipek", "ahsen"};
        arrayListOlustur(arr); // method oluşturuluyor.
        HashSet<String> arrHs=new HashSet<>(arrayListOlustur(arr)); // Methoddan List olarak dönen arr HashSet'e atılıyor
        TreeSet<String> arrTs=new TreeSet<>(arrayListOlustur(arr)); // Methoddan List olarak dönen arr TreeSet'e atılıyor
        LinkedHashSet<String> arrLhs=new LinkedHashSet<>(arrayListOlustur(arr)); // Methoddan List olarak dönen arr LinkedHashSet'e atılıyor

        System.out.println("HashSet: "+arrHs+"\nTreeSet: "+arrTs+"\nlinkedHashSet: "+arrLhs);
    }

    private static List<String> arrayListOlustur(String[] arr) {

        List<String> arrList = new ArrayList<>(); // arrList oluşturuluyor
        for (int i = 0; i < arr.length; i++) { //arr dizisi baştan sona döngüde
            arrList.add(arr[i]); // arr dizisinin elemanları tekte liste atılıyor.
        }
        return arrList;
    }
}
