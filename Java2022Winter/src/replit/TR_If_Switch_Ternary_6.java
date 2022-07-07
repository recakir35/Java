package replit;

import java.util.Scanner;

public class TR_If_Switch_Ternary_6 {
    public static void main(String[] args) {
        //Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır. Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.
        //Eger aynı karakterlere sahipse
        //"isim ayni karakterlere sahiptir." yazdirin.
        //Eger ayni kaakterlere sahip degilse
        //"Dizenin benzersiz karakterleri var" yazdirin.
        //Ternary kullanin.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Bir İsim Giriniz: ");
        String isim = scan.next();
        boolean sart = false;

        for (int i = 0; i < isim.length(); i++) {
            for (int k = 0; k < isim.length(); k++) {
                if (i != k && isim.charAt(i) == isim.charAt(k)) {
                    sart = true;
                }
            }
        }
        if (sart == true) {
            System.out.println("isim ayni karakterlere sahiptir.");
        } else System.out.println("Dizenin benzersiz karakterleri var");
    }
}
