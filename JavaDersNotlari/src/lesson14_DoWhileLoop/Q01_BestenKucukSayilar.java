package lesson14_DoWhileLoop;

public class Q01_BestenKucukSayilar {
    public static void main(String[] args) {
       // while loop ile 5 den küçük sayıları yazalım
    int intput=5;
    int sayi=1;

    while (sayi<intput){
        System.out.println(sayi);
        sayi++;
    }
// aynı soruyu do-while loop ile yapalım
        sayi=1;
        do {
            System.out.println(sayi);
            sayi++;
        } while (sayi<intput);
    }
}
