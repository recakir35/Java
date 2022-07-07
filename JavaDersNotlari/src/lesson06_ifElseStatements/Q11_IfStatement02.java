package lesson06_ifElseStatements;

import java.util.Scanner;

public class Q11_IfStatement02 {
    /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Notunuzu Giriniz: ");
        int not = scan.nextInt();

        if (not < 0 && not > 100) {
            System.out.println("Lütfen 0 ile 100 arasında bir sayı giriniz");
        } else if (not<=59){
            System.out.println("F");
        }else if (not<=69){
            System.out.println("D");
        }else if (not<=79){
            System.out.println("C");
        }else if (not<=89){
            System.out.println("B");
        }else if (not<=100){
            System.out.println("A");
        }
    }

}
