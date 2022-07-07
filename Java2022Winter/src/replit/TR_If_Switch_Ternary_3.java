package replit;

import java.util.Scanner;

public class TR_If_Switch_Ternary_3 {
    public static void main(String[] args) {
        //Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın.
        // Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.

        //Ornek: INPUT : 25 46 OUTPUT : Numaralarin Toplami: 71

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 1.Sayıyı Giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("Lütfen 2.Sayıyı Giriniz: ");
        int sayi2 = scan.nextInt();
        int toplam=0;

        if (sayi1 >= 0 && sayi2 >= 0) {
            toplam=sayi1+sayi2;
            if (toplam>999999999){
                System.out.println("OverFlow");
            }else System.out.println("Sayılar Toplamı: "+toplam);
        }
    }
}
