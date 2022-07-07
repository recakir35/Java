package lesson11_MethodCreation;

import java.util.Scanner;

public class Q04_StringdeKacKelime {

    public static void main(String[] args) {
         /*
        TASK :
        Bir String içinde kaç kelime olduğunu yazdıran bir method create ediniz.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir String Giriniz: ");
        String str= scan.nextLine();

        kelimeSayisiniBul(str);

    }

    private static void kelimeSayisiniBul(String str) {
        int sayac=1;
        for (int i = 0; i <str.length() ; i++) {
            if (str.substring(i,i+1).equalsIgnoreCase(" ")){
                sayac++;

            }
        }
        System.out.println("Cümle "+sayac+ " kelimeden oluşur.");
    }
}
