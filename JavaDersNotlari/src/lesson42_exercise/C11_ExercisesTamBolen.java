package lesson42_exercise;

import java.util.Scanner;

public class C11_ExercisesTamBolen {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane
        //olduklarini ekranda yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz: ");
        int sayi=scan.nextInt();
        int toplam=0;

        for (int i = 1; i <sayi ; i++) {

            if (sayi%i==0){
                System.out.print(i+ " + ");
                toplam+=i;
            }

        }
        System.out.println(" = "+ toplam);
    }
}
