package lesson39_linkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Q02_LinkedIn {

    public static void main(String[] args) {
		
			/*  TASK:
			 		Node'larin değereleri; "haluk" "ipek" "harun" "irem" olan bir LinkedList olusturun
			 		Kullanicidan bir isim alin o isim LinkedList'de varsa silin ve kullaniciya
			    	"Bu isim LinkedList'de vardi ve silindi" diye mesaj verin
			 		Girilen isim yoksa "Bu isim LinkedList'de yok bu yuzden silinemedi" diye mesaj verin
			 	
			 */
        LinkedList<String> node = new LinkedList<>(Arrays.asList("haluk", "ipek", "harun", "irem"));
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Silinecek ismi giriniz: ");
        String silinecekIsim = scan.nextLine();
        boolean kontrol = false;

        for (int i = 0; i <node.size() ; i++) {
            if (node.get(i).equalsIgnoreCase(silinecekIsim)){
                node.remove(i);
                System.out.println("Bu isim LinkedList'de vardi ve silindi");
                System.out.println(node);
                kontrol=true;
            }
        }
        if(!kontrol) System.out.println("Bu isim LinkedList'de yok bu yuzden silinemedi");
    }
}

