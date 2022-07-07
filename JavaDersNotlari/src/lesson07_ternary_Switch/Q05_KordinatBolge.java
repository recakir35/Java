package lesson07_ternary_Switch;

import java.util.Scanner;

public class Q05_KordinatBolge {
    public static void main(String[] args) {
        //TASK :  Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("X ve Y degerlerini giriniz: ");
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("girdiğiniz değerler 1.bölgeye ait");
        } else if (x < 0 && y > 0) {
            System.out.println("Girdiğiniz değerler 2. bölgeye ait");
        } else if (x < 0 && y < 0) {
            System.out.println("Girdiğiniz değerler 3. bölgeye ait");
        } else if (x > 0 && y < 0) {
            System.out.println("Girdiğiniz değerler 4. bölgeye ait");
        } else if (x != 0 && y == 0) {
            System.out.println("Girdiğiniz değerler x ekseni üzerinde");
        } else if (x == 0 && y != 0) {
            System.out.println("Girdiğiniz değerler y ekseni üzerinde");
        } else System.out.println("Girdiğiniz değerler orjindedir");
    }
}
