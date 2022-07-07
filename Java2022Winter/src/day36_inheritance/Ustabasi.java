package day36_inheritance;

public class Ustabasi extends Isci {

    public static void main(String[] args) {
        Ustabasi ustabasi1 = new Ustabasi();
        ustabasi1.saatUcreti = 15;
        ustabasi1.isim = "Murat";
        ustabasi1.soyisim = "Gökçek";
        ustabasi1.maas = ustabasi1.maasHesapla();
        ustabasi1.isciStatu = "Ustabaşı";
        System.out.println(ustabasi1);
    }

    @Override
    public String toString() {
        return "Ustabasi{" +
                "\nisciStatu='" + isciStatu + '\'' +
                "\nsaatUcreti=" + saatUcreti +
                "\nstatu='" + statu + '\'' +
                "\nmaas=" + maas +
                "\npersNo=" + persNo +
                "\nisim='" + isim + '\'' +
                "\nsoyisim='" + soyisim + '\'' +
                "\nadres='" + adres + '\'' +
                "\ntelefon='" + telefon + '\'' +
                '}';
    }
}
