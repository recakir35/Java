package lesson08_switch_StringManipulation;

import java.util.Scanner;

public class C08_ExerciseHarf {
    public static void main(String[] args) {
        //Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin
        //Kullanici S girerse “Software“
        //D girerse “Devoloper"
        //E girerse “Engineer"
        //T girerse “In Testing” yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen SDET harflerinden birini giriniz: ");

        char harf=scan.next().toUpperCase().charAt(0);
        switch (harf) {
            case 'S' :
                System.out.println("Software");
                break;
             case 'D' :
                System.out.println("Devoloper");
                break;
             case 'E' :
                System.out.println("Engineer");
                break;
             case 'T' :
                System.out.println("In Testing");
                break;
            default:
                System.out.println("Yanlış Harf Girdiniz");
        }
    }
}
