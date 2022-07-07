package day35_inheritance;

public class Isci extends Personel {
    public static void main(String[] args) {
        Personel objPersonel= new Personel();
        objPersonel.isim="Eren";
        objPersonel.soyisim="Terzioğlu";
        objPersonel.adres="Amsterdam";

        Isci objIsci=new Isci();

        objIsci.isim="Hüseyin";
        objIsci.soyisim="Efe";
        objIsci.adres="Ankara";

    }
}
