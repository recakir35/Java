package day12_stringManipulation;

public class C05_replace {
    public static void main(String[] args) {

        String str="Bugün ne çok şey öğrendik";

        // bu cümledeki boşluk dışındaki karakter sayısını bulunuz

        System.out.println("space hariç karakter sayısı: " +str.replace(" ","").length());
        // atama yapılmadığı sürece orjinal String kalıcı olarak değişmez
        //sadece o satır için değişiklik yapılıp sonuc yazdırılmış olur
        System.out.println("orjinal str karakter sayısı: "+ str.length());

        // str da kalıcı değişiklik yapalım

        str=str.replace("Bugün","Yarın");
        str=str.replace("öğrendik","öğreneceğiz");

        System.out.println("Yeni Stringimiz: "+ str);

        str.replace("ne çok","ne az");
        System.out.println(str.replaceAll("\\S","x"));

    }
}
