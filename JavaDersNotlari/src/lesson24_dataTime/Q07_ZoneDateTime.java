package practice_basic_day06;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Q07_ZoneDateTime {
    // Baska ülke veya bolgelerin saat dilimine gore zamani alma
    // Newyork un saat dilimine gore saat ?
    // zoneId Link :https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html
    public static void main(String[] args) {
        ZonedDateTime saat= ZonedDateTime.now(ZoneId.of("America/New_York"));

        ZonedDateTime saat1= ZonedDateTime.now(ZoneId.of("Turkey"));
        ZonedDateTime saat2= ZonedDateTime.now(ZoneId.of("Asya/Karachi"));

        DateTimeFormatter format= DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        System.out.println("Amerika- Newyork = " + saat.format(format)); //Amerika- Newyork = 04.04.2022 16:42
        System.out.println("Türkiye = " + saat1.format(format)); //Türkiye = 04.04.2022 23:43
        System.out.println("Pasifik = " + saat2.format(format));

    }


}
