package lesson12_ForLop;

import java.util.Scanner;

public class Q08_StringiTerstenYazdir {
    public static void main(String[] args) {
        //Soru 7 ) Interview Question: Kullanicidan bir String isteyin ve Stringi tersten yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Bir String Yazınız: ");
        String str=scan.nextLine();
        String tersStr="";

        for (int i = str.length()-1; i >=0 ; i--) {
        tersStr+=str.substring(i).charAt(0);
        }
        System.out.println("\n"+tersStr);
    }
}
