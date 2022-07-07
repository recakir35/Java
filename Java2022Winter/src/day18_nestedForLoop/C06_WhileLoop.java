package day18_nestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {
        // kullanıcıdan 2 tam sayı alıp bu sayıları ve aralarındaki tüm tam sayıları yazdıran bir kod oluşturunuz

        int baslangic=40;
        int bitis=60;


        for (int i = baslangic; i <=bitis ; i++) {
            System.out.print(i+" ");
        }
        System.out.println("");

        // ayni soruyu while loop ile yapalım

        while (baslangic<=bitis){
            System.out.print(baslangic+" ");
            baslangic++;
        }
    }
}
