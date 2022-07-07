package lesson42_exercise;

import java.util.Scanner;

public class TR_For_while_1 {
    public static void main(String[] args) {
        /*Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
            char ch1= 'a' ;
        	String name =“John came late"
        	Expected Output:
            Number of a = 2
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen İsim Giriniz: ");
        String name = scan.nextLine();
        System.out.print("Lütfen Harf giriniz: ");
        String letter = scan.next();
        int count = 0;

        for (int i = 0; i < name.length(); i++) {
            if (letter.equalsIgnoreCase(name.substring(i, i + 1))) {
                count++;
            }
        }
        System.out.println(letter + " harfi verilen isimde " + count + " adettir.");
    }
}
