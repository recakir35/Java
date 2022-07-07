package exercises;

public class C06_HarfleriYazdir {
    //’m’ harfinden baslayarak ‘c’ harfine kadar tum harfleri

    public static void main(String[] args) {
        char harf='m';

        do {
                System.out.print(harf + " ");
                harf--;
        } while (harf >='c');  // harf c'den büyük ve eşit oldukça döner
    }
}
