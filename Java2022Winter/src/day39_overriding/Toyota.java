package day39_overriding;

public class Toyota extends Araba {
    protected String hiz = "Toyota araçlar maximum 220 km hız yapar";
    protected String marka = "Toyota";
    protected String sirketMerkezi = "Japonya";


    public void motor() {
        System.out.println("Toyota arabalar toyota marka motor kullanırlar");
    }

    public void yakitTuketimi() {
        System.out.println("Arabalar motor tipi ve yakıt türüne göre yalıt tüketirler");
    }

    public void garanti(){
        System.out.println("Toyota araçlar 10 yıl garantilidir.");
    }
}
