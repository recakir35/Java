package practice_basic_day06;

import java.time.LocalDate;
import java.time.Month;

public class Q02_LocalDate02 {
    public static void main(String[] args) {

        /*
           Which of the following can be inserted into the blank to create a date of June 21, 2014?
           21 Haziran 2014 tarihini olusturmak için bos bırakılan yere asagidakilerden hangisi veya hangileri getirilebilir?
           A. new LocalDate(2014, 5, 21);
           B. new LocalDate(2014, 6, 21);
           C. LocalDate.of(2014, 5, 21);
           -->> D. LocalDate.of(2014, 6, 21); -->> LocalDate larda new keyword kullanılmaz
           -->> F. LocalDate.of(2014, Month.JUNE, 21);
         */

        LocalDate date= LocalDate.of(2014, Month.JUNE,21);// F) date = 2014-06-21
        System.out.println("date = " + date);
        LocalDate date1= LocalDate.of(2014, 6,21);// D) date1 = 2014-06-21
        System.out.println("date1 = " + date1);


    }
}
