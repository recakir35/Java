package lesson29_inheritance;

public class Child01 extends Parent{
    public static void main(String[] args) {
        /*
        Child class hiç bir objeye gerek duymadan
        parent classdaki variable ve method'lara ulaşabilir


         */
        System.out.println(isim); // Neval
        System.out.println(fabrika);//Yıldız Tekstil

        method1();
        method2();

    }
}
