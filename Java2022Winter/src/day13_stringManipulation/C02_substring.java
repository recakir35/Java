package day13_stringManipulation;

public class C02_substring {
    public static void main(String[] args) {
        // 1-48 of 104 results for "nutella"
        // bu arama sonucundaki bulunan sonuc sayısı 100'den cok ise süper
        // az ise "az sonuc bulundu"

        String str="1-48 of 104 results for \"nutella\"";

        int ilkSpace=str.indexOf(" "); //1. space
        int ikinciSpace=str.indexOf(" ",ilkSpace+1); // 2.space
        int ucuncuSpace=str.indexOf(" ",ikinciSpace+1);// 3.space

        String aramaSonucSayisiStr=str.substring(ikinciSpace+1,ucuncuSpace);
        int aramaSonucSayisiInt=Integer.valueOf(aramaSonucSayisiStr);
        if (aramaSonucSayisiInt>100){
            System.out.println("Süper");
        }else System.out.println("Az Sonuç");

    }
}
