package replit;

public class TR_If_Switch_Ternary_7 {
    public static void main(String[] args) {
        // isim1 çift sayıda karakter içeriyorsa,
        // ikinci kelimeyi ilk adın ortasına yerleştirin
        // ilk kelime tek sayida karakter iceriyorsa
        // “isim1, isim2 ye eklenemiyor” yazdırın

        // Örneğin:
        // isim1= mehmet
        // isim2= ahmet
        // Yazdır ==> mehahmetmet

        // isim1= memet
        // isim2= ahmet
        // Yazdır ==> isim1, isim2 ye eklenemiyor

        String name1="Mehmet";
        String name2="Ahmet";

        if (name1.length()%2==0){
            System.out.println(name1.substring(0,name1.length()/2)+name2+name1.substring(name1.length()/2));
        }else System.out.println("isim1, isim2 ye eklenemiyor");
    }
}
