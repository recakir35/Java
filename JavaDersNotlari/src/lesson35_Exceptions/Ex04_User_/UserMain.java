package lesson35_Exceptions.Ex04_User_;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UserMain {
    static List<User> userlist = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        userKayit();

    }

    private static void userKayit() {
        Random rnd = new Random();
        boolean kontrol = false;
        int id = 0;

        System.out.print("User Adı Giriniz:");
        String userAdi = scan.next();
        scan.nextLine(); //dummy
        // pasword kontrol bloğu
        String pasword = "";
        while (true) {              // doğru pasword girilene kadar döner
            kontrol = false;
            System.out.print("Pasword Giriniz:");
            try {
                pasword = scan.nextLine();
                if (pasword.length() < 6) { // pasword 6 karakterden düşükse exception fırlatır.
                    throw new IllegalStateException();
                }
            } catch (Exception e) {
                System.out.println("Pasword 6 karakterden küçük olamaz");
                kontrol = true;
            }
            if (!kontrol) break;         // kontrol doğru ise döngü kırılır
        }
        id++;
        boolean active = rnd.nextBoolean();
        boolean signedIn = rnd.nextBoolean();

        User user = new User(id, userAdi, pasword, active, signedIn); // User objesi oluşturuluyor.
        userlist.add(user);// obje listeye ekleniyor.

        int sn = 1;
        for (int i = 0; i < userlist.size(); i++) {// liste oluşturuluyor.
            System.out.println(sn + ". " + userlist.get(i));
            sn++;
        }
        System.out.print("Başka Kayıt Girmek İstiyormusun(E/H): ");
        char secim=scan.next().toUpperCase().charAt(0);

        if (secim=='E') userKayit();

    }

}
