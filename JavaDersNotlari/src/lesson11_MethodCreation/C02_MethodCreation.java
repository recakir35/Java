package lesson11_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {

        // kullanicidan bir kelime isteyin
        // eger kelime 3 harften kisa ise "kelime cok kisa" yazdirin
        // eger kelime 3,4 veya 5 harfli ise hardf sayisini ve
        // kelimenin tersten yazilisini yazdirin
        // eger 5 harften uzunsa "kelime cok uzun" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz: ");
        String kelime=scan.next();
        String terskelime="";


        if (kelime.length()<3){
            System.out.println("Kelime çok kısa");
        }else if (kelime.length()<=5){
            if (kelime.length()==3){
                terskelime=kelime.substring(2)+kelime.substring(1,2)+kelime.substring(0,1);
            }else if (kelime.length()==4){
                terskelime=kelime.substring(3)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1);
            }else {
                terskelime=kelime.substring(4)+kelime.substring(3,4)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1);
            }
            System.out.println("Girdiğiniz kelimedeki harf sayısı: "+kelime.length());
            System.out.println("Kelimenin tersten yazılışı: "+terskelime);
        }else {
            System.out.println("Kelime Çok Uzun");
        }

    }
}
