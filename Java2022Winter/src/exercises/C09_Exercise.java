package exercises;

import java.util.Scanner;

public class C09_Exercise {
    //Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degeri ve bitis degeri
    //dahil aradalarindaki tum cift tamsayilari while loop kullanarak ekrana yazdiriniz.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Başlangıç Sayısını Giriniz: ");
        int basSayi=scan.nextInt();
        System.out.print("Bitiş Sayısını Giriniz: ");
        int bitisSayi=scan.nextInt();

        for (int i = basSayi; i <=bitisSayi ; i++) {

            if (i%2==0){
                System.out.print(i+" ");
            }


        }
    }
}
