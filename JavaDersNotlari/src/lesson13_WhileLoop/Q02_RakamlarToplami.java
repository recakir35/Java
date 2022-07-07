package lesson13_WhileLoop;

public class Q02_RakamlarToplami {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

        int input=74656520;
        int rakam=0;
        int rakamlarToplami=0;

        while (input>0){
            rakam=input%10;
            rakamlarToplami+=rakam;
            input/=10;
        }
        System.out.println("Rakamlar Toplamı: "+rakamlarToplami);
    }
}
