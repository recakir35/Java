package day32_dataTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class C05_IkiTarihArasiniBulma {
    public static void main(String[] args) {
        LocalDate bugun= LocalDate.now();
        LocalDate dogumGunu= LocalDate.of(1979,03,20);

        System.out.println(Period.between(dogumGunu,bugun));//P50Y2M13D
        System.out.println(Period.between(dogumGunu,bugun).getYears());//50
        // FIXME: 31.03.2022
    }
}
