package lesson40_collections;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSet03_ {
    /*

	 		Soru: Elemanlari Alfabetik sirada dizen ve tekrarsiz bir collection elde etmek isterseniz ne kullanirsiniz
	    	Cevap: TreeSet

	 		Soru: Ama TreeSet cok yavastir. Nasil bir cozum bulabilirsin?
	 	    Cevap: HashSet olustururum, elemanlari HashSet'e eklerim.
	 	    Sonra HashSet'i TreeSet'e ceviririm boylece tekrarsiz ve alfabetik sirada bir collection'a sahip olmus olurum.
     */
    public static void main(String[] args) {
HashSet<String> hs = new HashSet<String>(); // HashSet oluşturuluyor
        hs.add("Zeynep"); //Oluşturulan hashset objesine Eleman giriliyor.
        hs.add("Cansel");
        hs.add("Firdevs");
        hs.add("Derya");
        hs.add("Recep");
        hs.add("Yaren");
        hs.add("Cansel");
        hs.add("Recep");
        hs.add("Recep");

        System.out.println("HashSet: " + hs);

        TreeSet<String> sT = new TreeSet<String>(hs); // Tekrarsız sıralı hale getirmek için TreeSet tanımlanıyor.
                                                    // HashSet elemanları Treeset'e atılıyor
        System.out.println("TreeSet " + sT);






    }
}
