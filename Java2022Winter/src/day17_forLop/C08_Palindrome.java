package day17_forLop;

public class C08_Palindrome {
    public static void main(String[] args) {
        // Interview Question Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden bir method yazin.
        //normaliyle tersiz aynı olan string palindromedır

        String input="nazan";
        palindromeKontrolEt(input);

    }

    private static void palindromeKontrolEt(String input) {
        String terstenInput="";

        for (int i = input.length()-1; i >=0; i--) {
            terstenInput+=input.charAt(i);

        }
        System.out.println("Girdiğiniz kelimenin tersten yazılışı: "+terstenInput);
        if (input.equalsIgnoreCase(terstenInput)){
            System.out.println("Girdiğiniz Kelime Palindrome");
        }else System.out.println("Girdiğiniz Kelime Palindrome değildir");
    }
}
