package lesson12_ForLop;

import java.util.Scanner;

public class Q09_StringiTersineCevirenMethod {
    public static void main(String[] args) {
        //Soru 8 ) Interview Question: Kullanicidan bir String isteyin ve Stringi tersine ceviren bir method yazin.
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Bir String Yazınız: ");
        String str=scan.nextLine();

        terstenYazdir(str);
    }

    private static void terstenYazdir(String str) {
        String tersStr="";

        for (int i = str.length()-1; i >=0; i--) {
            tersStr+=str.substring(i).charAt(0);
        }
        System.out.println("Girilen Stringin Tersi: "+ tersStr);
    }
}
