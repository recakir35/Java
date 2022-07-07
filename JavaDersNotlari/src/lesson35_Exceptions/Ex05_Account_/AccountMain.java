package lesson35_Exceptions.Ex05_Account_;


import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        secimMenu();
    }

    private static void secimMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("   ***   A T M   ***   ");
        System.out.println("\n1-Para Yatırma\n2-Para Çekme\n3-Çıkış ");
        System.out.print("Lütfen Seçim yapınız: ");
        int secim = scan.nextInt();

        switch (secim) {
            case 1:
                Account.paraEkle();
                secimMenu();
                break;
            case 2:
                Account.paraCikar();
                break;
            case 3:
                Account.cikis();
                break;
            default:
                System.out.println("Hatalı seçim yaptınız");
                secimMenu();
                break;
        }
    }
}
