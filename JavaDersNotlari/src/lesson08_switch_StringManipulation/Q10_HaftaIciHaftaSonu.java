package lesson08_switch_StringManipulation;

import java.util.Scanner;

public class Q10_HaftaIciHaftaSonu {
   // Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim
   public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       System.out.println("Bir Gün Giriniz: ");
       String gun=scan.next().toUpperCase();


       switch (gun) {
           case "PAZARTESİ" :
           case "SALI" :
           case "ÇARŞAMBA" :
           case "PERŞEMBE" :
           case "CUMA" :
               System.out.println("Haftaiçi");
               break;
          case "CUMARTESİ" :
          case "PAZAR" :
               System.out.println("Haftasonu");
               break;
           default:
               System.out.println("Yanlış Gün girdiniz");
       }
   }
}
