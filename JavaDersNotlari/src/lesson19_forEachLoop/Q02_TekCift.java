package practice_basic_day06;

import java.util.ArrayList;
import java.util.List;

public class Q02_TekCift {
    // int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
    // verilen array de once cift  olan sayilari, sonra da tek olan sayilari for each loop kullanarak yazdiriniz..
    public static void main(String[] args) {
int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
List<Integer> tekSayi=new ArrayList<>();
List<Integer> ciftSayi=new ArrayList<>();

for (int each:arr){
    if (each%2==0){
        ciftSayi.add(each);
    }else  tekSayi.add(each);
}
        System.out.println("Dizinin Tek Sayıları: "+tekSayi);
        System.out.println("Dizinin Çift Sayıları: "+ciftSayi);

    }
}
