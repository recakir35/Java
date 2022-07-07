package lesson42_exercise;

import java.util.Arrays;

public class C14_DMArraysToplama {
    public static void main(String[] args) {
        //Soru 4) Asagidaki multi dimensional array’in ic array’lerindeki tum elemanlarin toplamini
        //birer birer bulan ve herbir sonucu yeni bir array’in elemani yapan ve yeni array’i ekrana
        //yazdiran bir program yaziniz { { 1,2,3}, { 4,5}, {6,7}
        //Ornek:{{1,2,3},{4,5},{6,7}}===> 1+2+3=6 4+5=9 6+7=13=====>output {6,9,13}

        int arr[][]={ { 1,2,3}, { 4,5}, {6,7}};
        int toplam=0;
        int yeniArr[]=new int[3];

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                toplam+=arr[i][j];
            }
            yeniArr[i]=toplam;
            toplam=0;
        }
        System.out.println(Arrays.toString(yeniArr));
    }
}
