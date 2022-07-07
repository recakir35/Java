package lesson26_stringBuilder;

public class C04_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1= new StringBuilder("Prize dikkat");

        System.out.println(sb1.insert(12," edin."));

        String str="Hayatta çok güzel şeyler var";
        System.out.println(sb1.insert(0,str,0,8));

        System.out.println(sb1.reverse());

        System.out.println(sb1.reverse());

        System.out.println(sb1.substring(3, 5)); //at
        System.out.println(sb1); //Hayatta Prize dikkat edin.

        System.out.println(sb1.subSequence(3,5));//at
        System.out.println(sb1); //Hayatta Prize dikkat edin.
    }
}
