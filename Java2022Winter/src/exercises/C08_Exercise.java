package exercises;

public class C08_Exercise {
    public static void main(String[] args) {
        //For loop ve while Loop kullanarak 3 basamakli sayilardan 15, 20 ve 90’na tam
        //bolunebilen sayilari yazdirin.

        for (int i = 100; i < 1000; i++) {

            if ((i % 15 == 0) && (i % 20 == 0) && (i % 90 == 0)) {
                System.out.print(i + " ");
            }

        }
    }
}
