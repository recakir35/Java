package dosyaOkuma;

import java.io.*;
import java.nio.charset.Charset;

public class TurkceDosyayiOkutma {
    public static void main(String[] args) throws IOException {

        FileReader metin = new FileReader("src/dosyaOkuma/Liste1.txt", Charset.forName("UTF8")); // belirtilen yol ile bir obje oluşturduk
        BufferedReader bufferedReader = new BufferedReader(metin);
        System.out.println(bufferedReader.readLine());

        while (bufferedReader.ready()) {
            String okunanSatir = bufferedReader.readLine();
            System.out.println(okunanSatir);
        }
    }
}
