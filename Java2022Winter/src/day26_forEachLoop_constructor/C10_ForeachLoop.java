package day26_forEachLoop_constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C10_ForeachLoop {
    public static void main(String[] args) {
        //Soru 1: Bir integer array olusturunuz ve bu array’deki tum sayilarin carpimini For
        //each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
        int arr[]={2,5,6,8,4,3,8};
        int carpim=1;
        for (int each: arr) {
            carpim*=each;
        }
        System.out.println("Dizinin sayıları Çarpımı: "+ carpim);

        //Soru 2: Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin toplamini For
        //each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
        List<Integer> gril=new ArrayList<Integer>(Arrays.asList(2,5,6,8,4,7,9));
        int kareToplami=0;
        for (int i = 0; i <gril.size() ; i++) {
            kareToplami+=gril.get(i)*gril.get(i);
        }
        System.out.println("Liste elemanlarının Karesinin Toplamı: "+ kareToplami);

        //Soru 4: Bir String olusturunuz, bu String’deki character’leri for each loop kullanarak
        //yazdiriniz. ipucu: split()

        String str="recep";
        String arr5[]=str.split("");
        System.out.print("\nStringin elemanları: ");
        for (int i = 0; i <arr5.length ; i++) {
            System.out.print(arr5[i]+" ");
        }
    }
}
