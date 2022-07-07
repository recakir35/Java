package day10_switch_StringManipulation;

public class C03_Concate {
    public static void main(String[] args) {
        // concatenation yapmak içi iki ihtimal var
        // istersek + operatorunü kullanabilir veya String Class dan Concat kullanmak
        String str1="Java";
        String str2="Candir";

        // Java Candır yazdıralım

        System.out.println(str1 + " " + str2);

        String cumle= str1.concat(str2); // JavaCandır
        cumle=str1.concat(" ").concat(str2);

        System.out.println(cumle);

        cumle=str1.concat(" 5 ").concat(str2);

        System.out.println(cumle);

    }
}
