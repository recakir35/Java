package dosyaOkuma;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class DosyaBelliYerdenBölme {
    public static void main(String[] args) throws IOException {
        String path = "src/dosyaOkuma/Liste1.txt";                                 //bir dosya yolu belirlemek
        FileInputStream fis = new FileInputStream(path);// Java ya dosya olmaz ise diye exception uyarısı verir. Bizde bunu oluşabileceğini göstermesini ekledik.

        // Tüm Dosyayı yazdırmak
        int kontrol = 0;
        String metin = ""; // Metni bir değişkene atıp yazdırma

        while ((kontrol = fis.read()) != -1) {
            metin += (char) kontrol; //Metin değişkenine tüm dosyadaki yazılar atanıyor.
        }

            // Listeyi belli bir yerden bölüp bir arraya atıp saydırma(metni manipule etme)
        int urunSayisi = 0;
        String arr[] = metin.split("-");
        System.out.println("Ürün Sayısı: " + (arr.length - 1));
    }
}
