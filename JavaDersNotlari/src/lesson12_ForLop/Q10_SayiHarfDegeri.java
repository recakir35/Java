package lesson12_ForLop;

public class Q10_SayiHarfDegeri {

    // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

    public static void main(String[] args) {

        for (int i = 0; i <= 255; i++) {
            char karakter = (char) i;
            System.out.println(i + "--> " + karakter);
        }
    }

}
