package dosyaOkuma;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DosyayiYazdirma {
    public static void main(String[] args) throws IOException {
        String path = "src/dosyaOkuma/Liste1.txt";                                 //bir dosya yolu belirlemek
        FileInputStream fis = new FileInputStream(path);// Java ya dosya olmaz ise diye exception uyarısı verir. Bizde bunu oluşabileceğini göstermesini ekledik.

        // Tüm Dosyayı yazdırmak
        int kontrol = 0;
        String metin = ""; // Metni bir değişkene atıp yazdırma

        while ((kontrol = fis.read()) != -1) {
            metin += (char) kontrol; //Metin değişkenine tüm dosyadaki yazılar atanıyor.
        }
        System.out.println(metin); // Metin yazdırılıyor
    }
}
