package lesson06_ifElseStatements;

import java.util.Scanner;

public class Q01_NestedIfStatement {
    /*
    Kullanici dan yas bilgisini alarak

	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

	 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("LÜtfen Yaşınızı Giriniz: ");
        int age = scan.nextInt();

        if (age >= 18) {
            if (age >= 18 && age < 50) {
                System.out.println("bir kez oy kullanabilir");
            } else if (age >= 50 && age < 70) {
                System.out.println("iki kez oy kullanabilir");
            } else if (age >= 70) {
                System.out.println("uc kez oy kullanabilir");
            } else System.out.println("Oy Kullanamazsınız");
        } else System.out.println("Yaşınız Oy kullanmaya uygun değildir.");

    }
}


