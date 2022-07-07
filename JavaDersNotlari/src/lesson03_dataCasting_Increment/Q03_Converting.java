package lesson03_dataCasting_Increment;

public class Q03_Converting {
      public static void main(String[] args) {
          // galonu litreye ceviren bir java programi yaziniz  1 gallon = 3.785 litre
           double gallonMik=35;
           System.out.println(gallonMik +" Gallon ="+ (gallonMik*3.785) +" Litre'dir");

          // litreyi galona ceviren bir java programi yaziniz  1 litre = 1/3.785 gallon

          double litreMiktar=450;
          System.out.println(litreMiktar+" Litre  = " + (litreMiktar/3.785) +" Gallon'dur");

          // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
          // formül: c = (f-32)*5/9
          double fahrenhaytMiktar=59;

          System.out.println(fahrenhaytMiktar+" Fahrenhayt= "+ ((fahrenhaytMiktar-32)*5/9)+ " Santigrat'dir");
       }




}
