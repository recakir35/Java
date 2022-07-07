package day36_inheritance;

public class Child extends Parent{

    Child(){
        super();
        System.out.println("Child cons.Çalıştı");
    }
    // Tüm classlarda biz görmesek bile Javanın oluşturduğu
    // default construcctor vardır.

    //Extends keyword kullanan class'lardaki
    // Tüm Constructor'ların ilk satırında biz görmesek bile

    // süper() constructor call vardır.
    // yani parent class'in parametresiz constructor call
    public static void main(String[] args) {
        Child child = new Child();
    }
}
