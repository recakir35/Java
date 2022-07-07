package lesson10_stringManipulation;

import java.util.Scanner;

public class
Q03_TrueFalse {
    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Bir kelime giriniz: ");
        String kelime=scan.nextLine();
        baziharfleriIcerme(kelime);


    }

    private static void baziharfleriIcerme(String kelime) {
        if (kelime.contains("xyz")){
            System.out.println("Girdiğiniz String \"xyz\" harflerini birlikte içerdiğinden TRUE döndürür.");
        }else System.out.println("Girdiğiniz String \"xyz\" harflerini birlikte içermediğinden FALSE döndürür.");
    }
}
