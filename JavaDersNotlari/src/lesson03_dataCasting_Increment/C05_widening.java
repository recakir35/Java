package lesson03_dataCasting_Increment;

public class C05_widening {

    public static void main(String[] args) {

        //Soru 1 ) byte veri tipinde bir degisken olusturun, short,int,float ve double data tiplerinde
        //birer degisken olusturup adim adim widening yapin ve yazdirin

        byte sayi1=50;
        short sayi2=sayi1;
        System.out.println(sayi2);

        int sayi3=sayi2;
        System.out.println(sayi3);

        float sayi4=sayi3;
        System.out.println(sayi4);

        double sayi5=sayi4;
        System.out.println(sayi5);
        sayi1=(byte)sayi5;
        System.out.println(sayi1);
        //Soru 2 ) int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin
        //Soru 3 ) Float data turunde bir variable olusturun ve yazdirin
        //Soru 4 ) double 255.36 sayisini int’a ve sonra da olusturdugunuz int sayiyi byte’a cevirip
        //yazdirin
        //Soru 5 ) int 2 sayiyi birbirine boldurun ve sonucu yazdirin
        //Soru 6 ) int bir sayiyi double bir sayiya bolun ve sonucu yazdirin
        //Soru 7 ) Farkli data tipleri ile islem yapip, sonuclarini yazdiralim
    }
}
