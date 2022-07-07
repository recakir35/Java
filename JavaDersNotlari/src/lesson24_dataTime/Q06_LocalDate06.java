package practice_basic_day06;

import java.time.LocalDate;

public class Q06_LocalDate06 {

    // Bugunun tarihi aliniz, yazdiriniz...
    // Daha Sonra 1 gun, 1 Ay ve 1 yil ekleyerek degisen tarihi yazdiriniz..
    // Degisen tarih uzerinden 3 gun, 2 ay ve 5 yil eksilterek son tarihi yaziniz..

    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now();
        System.out.println(bugun);                  // Bugünün tarihi
        bugun = bugun.plusDays(1).plusMonths(1).plusYears(1); // Plus ile Ekleme
        System.out.println(bugun);                  // Bugünün tarihini atama yapılıyor..
        bugun=bugun.minusDays(3).minusMonths(2).minusYears(5); // Minus İle Çıkarma
        System.out.println(bugun);              // Son Durum
    }
}
