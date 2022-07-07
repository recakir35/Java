package lesson11_MethodCreation;

import java.util.Scanner;

public class Q07_KelimeKelimeTerstenYazdir {
    public static void main(String[] args) {
        /*
    TASK :
    Kullanıcıdan aldığınız bir String'deki kelimeleri sondan başa doğru yerleştiren
    String parametreli return type li reverseWord isminde bir method create ediniz

     Test Data :
    İnput : Allah Javacı arkadaşlara zihin açıklığı versin
    Output : versin açıklığı zihin arkadaşlara Javacı Allah
     */
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir String Giriniz: ");
        String str = scan.nextLine();

        reverseWord(str);

    }

    public static void reverseWord(String str) {
        int bosluk = str.length();

        for (int i = str.length(); i > 0; i--) {

            if (str.substring(i - 1, i).equalsIgnoreCase(" ")) {

                bosluk = i - 1;
            }
            System.out.print(str.substring(i+1, bosluk) + " ");
        }
        System.out.println(bosluk);
    }
}