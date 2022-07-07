package exercises;

public class C12_ExercisesYediKatları {
    //9 den 190 e kadar 7 nin kati olan tum tamsayilari ekrana yazdiriniz.
    public static void main(String[] args) {
        int sayi=9;

        do {
            if (sayi%7==0){
                System.out.print(sayi+" ");
            }
            sayi++;
        } while (sayi<190);
    }

}
