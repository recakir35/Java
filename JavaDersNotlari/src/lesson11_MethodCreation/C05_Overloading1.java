package lesson11_MethodCreation;

public class C05_Overloading1 {
    public static void main(String[] args) {
        String str="Bu da geçer ya Huu";
        System.out.println(str.indexOf("d")); //3
        System.out.println(str.indexOf("a",5));//13

        // Bir klasta aynı isimde birden fazla method olmasına overloading denilir
        // ya parametre sayısı farklı olmalı
        // veya parametre sayısı aynı ise argümentlerin data türleri farklı olmalı
    }
}
