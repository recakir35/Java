package replit;

import java.util.Scanner;

public class TR_Scanner_2 {
    public static void main(String[] args) {
        //Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.
        //
        //Ornek Cikti :
        //
        //Alan: 9
        //
        //Cevre: 12

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Karenin kenar Uzunluğunu Giriniz: ");
        int kenar=scan.nextInt();

        System.out.println("Alan: "+(kenar*kenar));
        System.out.println("Cevre: "+(4*kenar));
    }
}
