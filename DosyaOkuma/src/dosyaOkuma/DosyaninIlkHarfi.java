package dosyaOkuma;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DosyaninIlkHarfi {
    public static void main(String[] args) throws IOException {
        String path = "src/dosyaOkuma/Liste1.txt";                                 //bir dosya yolu belirlemek
        FileInputStream fis = new FileInputStream(path);// Java ya dosya olmaz ise diye exception uyarısı verir. Bizde bunu oluşabileceğini göstermesini ekledik.

        System.out.println((char) fis.read());// Dosyanın ilk harfini okutur
    }
}
