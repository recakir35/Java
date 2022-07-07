package replit;

import java.util.Scanner;

public class TR_Scanner_3 {
    public static void main(String[] args) {
        //Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.
        //
        //Örnek Çıktı:
        //
        //Alan: 32
        //
        //Çevre: 24
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Dikdörtgenin 1.kenar Uzunluğunu Giriniz: ");
        int kenar1=scan.nextInt();
        System.out.print("Lütfen Dikdörtgenin 2.kenar Uzunluğunu Giriniz: ");
        int kenar2=scan.nextInt();

        System.out.println("Alan: "+(kenar1*kenar2));
        System.out.println("Cevre: "+((2*kenar1)+(2*kenar2)));
    }
}
