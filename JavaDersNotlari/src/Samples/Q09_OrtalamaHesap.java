package practice_free2;

public class Q09_OrtalamaHesap {
    /*
     * write a java program that calculates the average value of array elements
     * Print elements that are greater than avarage
     * (dizi elemanlarinin ortalama degerini hesaplayan ve
     * onlari yazdıran bir java programi yazin)
     * input[]= {1,2,3,4,5,6,7}
     * Output : 4
     */
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        double ortalama=0;

        for (int i = 0; i <arr.length ; i++) {
            ortalama+=arr[i];
        }
        ortalama/=arr.length; // ortalama
        System.out.println("ortalama: "+ortalama);

    }
}
