package day13_stringManipulation;

public class C04_Execise {
    public static void main(String[] args) {
        //String methodlarini kullanarak Java ogrenmek 123 Cok guzel@ String’ini “Java
        //ogrenmek cok guzel sekline getirin

        String str="Java ogrenmek 123 Cok guzel@";

        str=str.replace("123 C","c");
        str=str.replace("@","");
        System.out.println(str);
    }
}
