package lesson30_inheritance;

public class SurekliIsciler extends Isci{


    public static void main(String[] args) {
        SurekliIsciler suric1=new SurekliIsciler();

        suric1.persNo=5001;
        suric1.isim="Cem";
        suric1.soyisim="Akay";
        suric1.statu="Isci";
        suric1.saatUcreti=11;
        suric1.maas=suric1.maasHesapla();
        System.out.println(suric1);


    }

    @Override
    public String toString() {
        return "SurekliIsciler{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }
}
