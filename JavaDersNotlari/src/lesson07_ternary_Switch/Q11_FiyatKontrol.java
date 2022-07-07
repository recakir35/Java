package lesson07_ternary_Switch;

public class Q11_FiyatKontrol {
    /*
     * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
     * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
     * olsun
     */
    public static void main(String[] args) {

        double fiyat= 9;

        System.out.println( (fiyat>0 && fiyat<10) ? "Ucuz" :  (fiyat>=10 && fiyat<20) ? "Normal" : (fiyat>=20) ? "Pahalı" : "Yanlış Giriş Tekrar Dene");



    }
}
