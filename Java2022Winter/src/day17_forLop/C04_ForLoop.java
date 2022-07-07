package day17_forLop;

public class C04_ForLoop {
    public static void main(String[] args) {
        //2-10 ile 30 arasindaki(10 ve 30 dahil) sayilari aralarinda virgul olarak ayni satirda yazdirin

        for (int i = 10; i <= 30; i++) {
            System.out.print(i + ",");

        }
        //
        int baslangic = 10;
        int bitis = 30;
        System.out.println("\n");
        for (int i = baslangic; i <= bitis; i++) {
            if (i < bitis) {
                System.out.print( i + ",");
            } else System.out.println(i);
        }

    }
}
