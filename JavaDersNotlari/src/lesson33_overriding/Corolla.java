package lesson33_overriding;

public class Corolla extends Toyota {
    protected String hiz = "Corolla Maximum 200 km hız yapar";
    protected String yakıt = "Corolla benzinli veya elektriklidir";
    protected String model = "Corolla";

    public void motor() {
        System.out.println("Corolla araçlar çevreci motor kullanır");
    }

    public void yakitTuketimi() {
        System.out.println("Corolla 5.6 lt yakıt tüketir");
    }

    public void vitesSayisi() {
        System.out.println("Corolla 5 vites araçtır");
    }

    public static void main(String[] args) {

        /* Data türü ve constructor farklı olduğunda Constructor çalıştığı için obje
        Constructor'ın olduğu class özelliklerini taşır ancak Data türü Parent class seçildiği için
        variablelar Data türünün seçildiği class ve onun Parent classlarından değer alabilir.

        Methodlar için ise yine Data türünün olduğu classa gideriz ancak direk methodu çalıştırmadan önce method Override edilmişmi diye kontrol ederiz.

         */

        Corolla arb1 = new Corolla();
        System.out.println(arb1.hareket);// Araba clasından
        System.out.println(arb1.hiz);// Corolla clasından
        System.out.println(arb1.yakıt);// Corolla clasından
        System.out.println(arb1.marka);// Toyata clasından
        System.out.println(arb1.sirketMerkezi);// Toyata clasından
        System.out.println(arb1.model);// Corolla clasından
        arb1.motor();// Corolla clasından

        System.out.println("**********************************************");

        Toyota arb2 = new Toyota();
        System.out.println(arb2.hareket);// Araba clasından
        System.out.println(arb2.hiz);// Toyota clasından
        System.out.println(arb2.yakıt);// Araba clasından
        System.out.println(arb2.marka);// Toyata clasından
        System.out.println(arb2.sirketMerkezi);// Toyata clasından
        // System.out.println(arb2.model);// CTE
        arb2.motor();// Corolla clasından
        arb2.garanti();//Toyota clasından
        arb2.yakitTuketimi();//Corolla clasından
       //arb2.vitesSayisi();// Data türü olan Toyotadan başlayınca böyle bir methot bulamadık dolayısıyla CTE

        System.out.println("**********************************************");

        Araba arb3 = new Araba();
        System.out.println(arb3.hareket);// Araba clasından
        System.out.println(arb3.hiz);// Araba clasından
        System.out.println(arb3.yakıt);//Araba clasından
        System.out.println(arb3.marka);// Araba clasından
        //System.out.println(arb3.sirketMerkezi);// CTE
        //System.out.println(arb3.model);// CTE
        arb3.yakitTuketimi();//Corollo classdan
        arb3.motor();//Corolla classdan
        //arb3.garanti();//CTE aramaya Araba Classından başladı
        //arb3.vitesSayisi();//CTE aramaya Araba Classından başladı

    }
}
