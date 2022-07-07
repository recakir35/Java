package lesson33_overriding;

public class Araba {
   protected String hareket="Arabalar Teker ile hareket eder";
   protected String hiz="Arabalar motor gücüne göre hız yaparlar";
   protected String yakıt="Arabalar farklı yakıtlar kullanabilirler";
   protected String marka="Arabalar üretildikleri markaya sahiptir";

    public void motor() {
        System.out.println("arabalar farklı markalarda motor kullanırlar");
    }

    public void yakitTuketimi(){
        System.out.println("Arabalar motor tipi ve yakıt türüne göre yalıt tüketirler");
    }
}
