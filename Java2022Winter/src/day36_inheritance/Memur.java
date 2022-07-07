package day36_inheritance;

public class Memur extends Muhasebe {

    public static void main(String[] args) {
        Memur memur1=new Memur();
        // memur1 objesi memur clasının objesi olmasına rağmen
        // inherit ettiği muhasebe ve onunda parentı olan personel
        // claslarındaki tüm dataları alabilir.

       // Personel Clasından
        memur1.persNo=1001;
        memur1.isim="Ahmet";
        memur1.soyisim="Tepecik";
        memur1.adres="Ankara";
        memur1.telefon="03125756595";

        // Muhasebe Clasından
        memur1.saatUcreti=10;
        memur1.maas=memur1.maasHesapla();
        memur1.statu="Memur";

        System.out.println(memur1);

        Memur memur2 = new Memur();
        memur2.persNo=1002;
        memur2.saatUcreti=10;


        System.out.println(memur2);
    }

    @Override
    public String toString() {
        return "Memur{" +
                "\nsaatUcreti=" + saatUcreti +
                "\n statu='" + statu + '\'' +
                "\nmaas=" + maas +
                "\npersNo=" + persNo +
                "\nisim='" + isim + '\'' +
                "\nsoyisim='" + soyisim + '\'' +
                "\nadres='" + adres + '\'' +
                "\ntelefon='" + telefon + '\'' +
                '}';
    }

}
