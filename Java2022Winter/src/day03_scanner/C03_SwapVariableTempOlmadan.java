package day03_scanner;

public class C03_SwapVariableTempOlmadan {

        /*
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini
        ucuncu bir variable kullanmadan degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
         sayi1=20 ve sayi2=10
         */
        public static void main(String[] args) {

                int sayi1=10, sayi2=20;

                System.out.println("Swap'tan önce Sayı1: "+ sayi1 + " Sayı2: "+ sayi2);

                sayi1=sayi1+sayi2; // Sayı1:=30
                sayi2=sayi1-sayi2; // Sayı2=10
                sayi1=sayi1-sayi2; // Sayı1=20

                System.out.println("Swap'tan sonra Sayı1: "+ sayi1 + " Sayı2: "+ sayi2);
        }
}
