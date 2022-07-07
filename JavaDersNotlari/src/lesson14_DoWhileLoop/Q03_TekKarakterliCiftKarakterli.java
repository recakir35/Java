package lesson14_DoWhileLoop;

import java.util.Scanner;

public class Q03_TekKarakterliCiftKarakterli {
    /* WhileLoop,DoWhile
		Ask user to enter a word. If the word has odd number of characters
		 and has 3 or more characters,
		 print the character in the middle of the word.
		 the word has even number of character print "You entered wrong word."
		 Kullanıcıdan bir kelime girmesini isteyin. Sözcük tek sayıda karaktere sahipse ve 3 veya daha fazla karaktere sahipse, sözcüğü sözcüğün ortasına yazdırın.
		 kelime çift sayıda karakter baskısına sahip "Yanlış kelime girdiniz."
		     INPUT      :   celik
		     OUTPUT 	:   l
		     INPUT      :   elif
		     OUTPUT 	:   You entered wrong word.*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Kelime Giriniz: ");
        String str = scan.nextLine();
        int ortanca=str.length()/2;

        for (int i = 0; i < str.length(); i++) {

            if (str.length()<=3){
                System.out.println("Lütfen 3 karakterten fazla bir sayi giriniz: ");
                break;
            }else  if (str.length()%2==0){
                System.out.println("Yanlış kelime girdiniz. Tek Karakter sayılı sayı giriniz");
                break;
            }else if (i==ortanca){
                System.out.println(str.substring(i,i+1));
            }


        }
    }

}
