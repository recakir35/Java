package lesson11_MethodCreation;

import java.util.Scanner;

public class Q03_StringKontrol {
    public static void main(String[] args) {
        /*  TASK :
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden method create ediniz.
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç Saati Saniyeye Çevirmek İstersiniz: ");
        String str= scan.nextLine();
        boolean sonuc=xyzKontrol(str);
        System.out.println(sonuc);
    }

    public static boolean xyzKontrol(String str) {
        boolean kontrol=false;
        if (str.contains("xyz")){
            kontrol=true;
        }else kontrol=false;
        return kontrol;
    }

}
