package lesson16_Arrays;

public class Q07_OrtalamadanBuyukELemanlar {
    public static void main(String[] args) {
        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */

        int input[] = {1, 2, 3, 4, 5, 6, 7};
        int toplam = 0;

        for (int i = 0; i < input.length; i++) {
            toplam += input[i];
        }
        toplam = toplam / input.length; // averajı buluyor
        System.out.println("Averaj= " + toplam); // averajı yazdırıyor
        System.out.print("Averajdan Büyük Dizi Elementleri: ");
        for (int i = 0; i < input.length; i++) {
            if (toplam <input[i]){
                System.out.print(input[i]+" ");
            }
        }
    }
}
