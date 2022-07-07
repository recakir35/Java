package lesson42_exercise;

public class TR_For_while_9 {
    public static void main(String[] args) {
        /*
        Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)
        Input :1238
        Output :Girilen Numananin Tersi: 8321
         */
        int input=1238;
        int girilenSayi=input;

        while (girilenSayi!=0){
            System.out.print(girilenSayi%10);
            girilenSayi/=10;
        }
    }
}
