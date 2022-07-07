package exercises;

import java.util.Arrays;

public class C03_ArrayOlusturmaYazdırma {
    public static void main(String[] args) {
        //1-Elemanlari “Ali” , “Veli”, “Ayse” ve “Fatma” olan bir array olusturun ve bu array’i yazdirin.
        // 2-Soru 1’deki elemanlardan “Ali” yerine “Can”, “Ayse” yerine “Gul” atayin.

        String arr[]={"Ali","Veli","Ayse","Fatma"};
        System.out.println(Arrays.toString(arr));//[Ali, Veli, Ayse, Fatma]
        arr[0]="Can";
        arr[2]="Gül";
        System.out.println(Arrays.toString(arr));//[Can, Veli, Gül, Fatma]
    }
}
