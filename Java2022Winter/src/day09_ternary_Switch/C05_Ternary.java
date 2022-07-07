package day09_ternary_Switch;

public class C05_Ternary {
    public static void main(String[] args) {
        // Bazen Ternary deki iki sonucun data türleri farklı olabilir

        //verilen sayi 100 den büyükse sayının karesini alıp yazdıran
        //100 den küçükse "sayı 100 den büyük olmalı" yazdıran bir ternary

        int sayi=150;
        // ternary bize sonuc getirdiğinden  ya sonucu direk yazdırmalıyız
        // veya bir değişkene atamalıyız
        // eğer sonuclar farklı data türlerindeyse
        //atama yapacağımız variable'ın data türü tek olacağından atayamayız
        System.out.println(sayi>100 ? sayi*sayi : "sayı 100 den büyük olmalı");
    }
}
