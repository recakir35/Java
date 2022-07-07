package lesson28_encapsulation;
public class C01_Encapsulation {
    public static void main(String[] args) {
        /* Bir variable'i encapsule etmek icin
            1- Access modifier'i private yapariz
            2- okuma ve yazma ozelliklerinin kullanilmasini istedigimiz gibi sinirlayabiliriz
                - Eger sadece okunmasini istiyorsaniz getter
                - Sadece deger girilebilsin isterseniz setter
               methodlarini olustururuz.
           Bir variable icin hem getter hem setter olusturursaniz
           o variable public olmus gibi hem okuyup hem de yazilmasini saglayabilirsiniz

         Piyasada developerlar arasında genel uygulamada böyledir.
         */
        C02_Encapsulation obj =new C02_Encapsulation();
        System.out.println(obj.getSayi()); // 0
        obj.setStr("Java Java Java");
        System.out.println(obj.getStr()); // Java Java Java
        System.out.println(obj); // sayi=0, str=Java Java Java
    }
}
