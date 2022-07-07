package lesson26_stringBuilder;

import java.util.Scanner;

public class Q01_TerstenYazdirma {
    public static void main(String[] args) {
		/*
		Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I 
	        It is not a palindrome"

		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Cümle veya Kelimi giriniz: ");
        String str = scan.nextLine();
        StringBuilder strbuld = new StringBuilder(str);
        String str2=strbuld.reverse().toString(); // toString() method'unu kullaninca SB String'e donusmus olur
                                                    // dolayisiyla tum String methodlari kullanilabilir


        if (str.equals(str2)) {
            System.out.println("Verilen Cümle veya Kelime palindromdur");
        } else System.out.println("Verilen Cümle veya Kelime palindrom DEĞİLDİR");

    }

}
