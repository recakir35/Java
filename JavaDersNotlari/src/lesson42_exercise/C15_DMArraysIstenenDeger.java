package lesson42_exercise;

import java.util.Arrays;

public class C15_DMArraysIstenenDeger {
    public static void main(String[] args) {
        //Soru 6) Verilen bir Array’den isten degere esit olan elamanlari kaldirip, kalanlari yeni bir
        //Array olarak yazdiran bir method yaziniz

        int arr[]={0,1,6,1,9,8,1,7,4,1};
        int cikarilacakElement=1;

        elemanCikarma(arr,cikarilacakElement);

    }

    private static void elemanCikarma(int[] arr, int cikarilacakElement) {
        int cikarilacakElementSayiyi=0;

        for (int i = 0; i <arr.length; i++) {
            if (cikarilacakElement == arr[i]){
                cikarilacakElementSayiyi++;
            }
        }

        int arrYeni[]=new int[arr.length-cikarilacakElementSayiyi];
        int j=0;


        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]!=cikarilacakElement){
                arrYeni[j]=arr[i];
                j++;
            }

        }
        System.out.println(Arrays.toString(arrYeni));
    }
}
