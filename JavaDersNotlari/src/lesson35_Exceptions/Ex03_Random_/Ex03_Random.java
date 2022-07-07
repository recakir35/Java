package lesson35_Exceptions.Ex03_Random_;

public class Ex03_Random {
    public static void main(String[] args) {
        randomSayi();
    }

    private static void randomSayi() {
        double sayi1 = Math.random() * 20; //0-20 arası sayı üretir. Math.random double sayı üretir.
        double sayi2 = Math.random() * 20;
        double toplam = 0;

        try {
            toplam = sayi1 + sayi2;
            if (toplam < 12) {      // toplam 12 den küçükse exception fırlatıyor.
                throw new ArithmeticException();
            } else System.out.println("Sayi1= " + sayi1 + " Sayı2= " + sayi2);
        } catch (Exception e) {
            System.out.println("Sayıların Toplamı 12 den küçüktür. Toplam" + toplam);
            System.out.println("Sayi1= " + sayi1 + " Sayı2= " + sayi2);
        }


    }
}
