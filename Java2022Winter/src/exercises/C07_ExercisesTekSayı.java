package exercises;

public class C07_ExercisesTekSayı {
    public static void main(String[] args) {
        //While loop kullanarak 3 den 13 e kadar tum tek tamsayilari ekrana yazdiriniz.

        int sayi=3;

        while (sayi<=13){

            if (sayi%2!=0){
                System.out.print(sayi+" ");
            }
            sayi++;
        }
    }
}
