package lesson08_switch_StringManipulation;

import java.util.Scanner;

public class Q07YildizliKartBilgisi {
    public static void main(String[] args) {
        /*
            TASK :
         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */

		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen İsmi Giriniz: ");
        String isim=scan.nextLine();
        System.out.println("Lütfen Soyisim Giriniz: ");
        String soyIsim=scan.nextLine();
        System.out.println("Lütfen Kart No Giriniz: ");
        String kart=scan.nextLine();

        System.out.println(isim.replace(isim.substring(1),"*"));
        if (kart.length()!=16){
            System.out.println("Geçersiz Kredi Kartı No Girdiniz");
        }
        System.out.println("İsim: "+isim.toUpperCase().charAt(0)+isim.replace("*",isim.substring(1)));


    }
}
