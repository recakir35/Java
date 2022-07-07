package lesson12_ForLop;

public class Q04_IkiHarfArasiHarfler {
    public static void main(String[] args) {
        // verilen iki harf ve aralarındaki harfleri yazdıran bir kod yazınız

        char ilkHarf='m';
        char sonHarf='s';

        for (char i = ilkHarf; i <=sonHarf ; i++) {
            System.out.print(i+" ");
        }

        double baslangıc=10;
        double bitis=20;
        double artis=0.2;
        System.out.println("\n");
        // başlangıç ve bitiş arasındaki artış miktarı ile oluşacak tüm sayıları yazdırın,
        for (double i = baslangıc; i <=bitis ; i+=artis) {
            System.out.print(i+ " ");

        }
    }
}
