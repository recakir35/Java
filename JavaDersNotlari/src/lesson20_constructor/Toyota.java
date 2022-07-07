package lesson20_constructor;
public class Toyota {
    String marka="Toyota";
    int tekerAdedi=4;
    boolean motoruVarMi=true;
    String model;
    String yakit;
    int yil;
    public void maxHiz(){
        if (yakit.equals("Benzin")){
            System.out.println("Benzinli araçlar max 240 km hız yapar");
        }else if (yakit.equals("Dizel")){
            System.out.println("Dizel Araçlar max 260 km hız yapar");
        }
    }

    public void renkTercihleri(){
        if (model.equals("Toyota")){
            System.out.println("Corolla renk seçenekleri kırmızı beyaz");
        } else if (model.equals("Yaris")){
            System.out.println("Yaris renk seçenekleri Sarı ve Lacivert");
        }
    }
}
