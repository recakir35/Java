package practice_basic_day06;

import java.time.LocalDate;
import java.time.Month;

public class Q03_LocalDate03 {
    public static void main(String[] args) {

        /*
         What is the output of the following code?
        Asagidaki code'un  ciktisi  nedir?
        */
        LocalDate date = LocalDate.of(2018,Month.FEBRUARY, 29);

        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
//Şubat artık yıl değildir. 2018 4' katı değil ara yıl onun için 28 çekmeli 29 yazılmış bunun için hata verir.
            /*
            A. 2018 APRIL 29
            B. 2018 APRIL 30
            C. 2018 MAY 10
            D. Another date.
            E. The code does not compile.
            -->> F. A runtime exception is thrown.
            */

    }
}
