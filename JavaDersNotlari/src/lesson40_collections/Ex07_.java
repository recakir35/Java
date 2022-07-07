package lesson40_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Ex07_ {

    /*  TASK :
     * main method altinda bir double hashSet olusturunuz.
     *
     * ve bu seti, adi setOlustur ve return tipi hashSet double olan
     *
     * ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini
     * kullanarak doldurun.
     *
     * adini toplaminiAl koyacagimiz ve parametre olarak bir Double hashSet kabul
     * edecek ayri bir method olusturarak
     *
     * hashSetin degerlerinin toplamini alacaksiniz.
     */

    public static void main(String[] args) {
        toplaminiAl(setOlustur());// toplamınıAl methodunun parametresi setOluştur() methodudur

    }

    private static void toplaminiAl(HashSet<Double> setOlustur) {
        double toplam = 0;
        List<Double> yeniHs = new ArrayList<>(); // Toplamlarını alabilmek için Seti listeye atmamız gerek çünkü Set'e index yoktur
        yeniHs.addAll(setOlustur); // Yeni oluşturulan yeniHs adındaki list'e  hs seti aktarılıyor.
        System.out.println(yeniHs);

        for (double each : yeniHs) { // list'le toplama işlemi yapılıyor.
            toplam += each;
        }
        System.out.println("Set Toplamı: " + toplam);
    }

    private static HashSet<Double> setOlustur() {
        HashSet<Double> hs = new HashSet<Double>(); // hs adında bir HashSet oluşturuluyor.
        hs.add(3.23); // hs adında oluşturulan HashSet'e değer atanıyor.
        hs.add(3.10);
        hs.add(5.12);
        hs.add(10.12);
        hs.add(23.12);
        return hs;
    }
}
