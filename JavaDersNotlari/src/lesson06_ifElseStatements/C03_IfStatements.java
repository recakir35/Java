package lesson06_ifElseStatements;

public class C03_IfStatements {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        if (a == b) {

            System.out.println("Verilen Sayılar Eşittir.");
        }

        if (a > 100) {
            System.out.println(" a yüzden büyük");
        }

        if (a * b > 5) {

            System.out.println("sayıların çarpımı 5 den büyük");
        }
        // bağımsız if cümleleri kendileri dışındaki kodlarla ilgilenmezler
        // bir şart ve o şarta bağlıdır
        // birden fazla bağımsız if cümlesi olduğunda hepsinin body'si çalışabilirde çalışmayabilirde
    }
}
