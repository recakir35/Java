package lesson15_Scope;

public class C01_instanceVariable {
    int sayi;                   // default değer "0"
    String bransIsmi="java";    // default değer "Null"
    boolean okuldaMi;         // default değer "false"

    public static void main(String[] args) {

        // sayi=10; sayi variable'i static olmadığı için main method'dan direk kullanılamaz
        // instance variable'lara staticmethod'lardan ulaşabilmek için obje oluşturmamız gerekir

        C01_instanceVariable obj1=new C01_instanceVariable();
        System.out.println(obj1.sayi);//0
        obj1.sayi=10;
        System.out.println(obj1.sayi);//10
        obj1.bransIsmi="SQL";
        System.out.println(obj1.okuldaMi);//false

        C01_instanceVariable obj2=new C01_instanceVariable();
        System.out.println(obj2.sayi);//0
        System.out.println(obj2.bransIsmi);//Java

        obj1.okuldaMi =true;
        System.out.println(obj2.okuldaMi); //false

    }
}
