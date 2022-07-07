package lesson06_ifElseStatements;


import java.util.Scanner;

public class Q12_IfStatement03 {
    /*
    Print "Lutfen is unvaninizi girin
    jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
    Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
    Eger jobTitle  qa ise print is unvaniniz Quality Analyst
    test data: qa ise print Quality Analyst
    dev ise print Developer
    ba ise print Business Analyst
    pm ise print Project Manager
   */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen İş Ünvanını Giriniz(qa, test data, dev, ba, pm): ");
        String jobTitle = scan.nextLine().toUpperCase();
        System.out.println(jobTitle);
        if (jobTitle.equals("QA")  || jobTitle.equals("TEST DATA")) {
            System.out.println("Mesleğiniz: Quality Analyst");
        } else if (jobTitle.equals("DEV")) {
            System.out.println("Mesleğiniz: Developer");
        } else if (jobTitle.equals("BA")) {
            System.out.println("Mesleğiniz: Business Analyst");
        } else if (jobTitle.equals("PM")) {
            System.out.println("Mesleğiniz: Project Manager");
        } else System.out.println("Lütfen İstenen Mesleklerden birini giriniz.");
    }

}
