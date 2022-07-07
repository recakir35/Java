package lesson24_dataTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime tarihSaat =  LocalDateTime.now();

        System.out.println(tarihSaat);//2022-03-31T22:35:38.334763700

        System.out.println(tarihSaat.plusYears(3).plusDays(10));
        System.out.println(tarihSaat.getYear());
    }
}
