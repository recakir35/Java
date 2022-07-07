package lesson42_exercise;

public class TR_For_while_4 {
    public static void main(String[] args) {
        /*Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.
                Input : 6
                Output: 6!=65432*1=720 */
        int sayi=6;
        int carp=1;

        System.out.print("6!=");
        for (int i = 6; i >0 ; i--) {
            carp*=i;
            if (i>1){
                System.out.print(i+" * ");
            }else System.out.print(i+" = "+carp);
        }
    }
}
