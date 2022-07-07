package day21_arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        // array' nasıl declare ederiz
        // data türü, array ismi ve köşeli parantez yazarak array deklare edilir
        int arr1[]={1,3,5};
        int[] arr2={2,3,5};
        int [] arr3={1,4,5};

        double arr4[]={10.2,20.1,5};
        String arr5[]={"Ali", "Veli", "Ayşe"};
        //assign mecburi midir?
        int arr6[];
        // kullanmadan önce mutlaka değer ataması yapmamız gerekir

        //hem declaree edip hemde atama yapacaksam nasıl yapabilirim
        //1-deklare edip eşitliğin sağına süslü parantez içerisinde değerleri yazabilirim
        String arr7[]={"Ali", "Veli", "Ayşe"};
        //2-eğer sadece oluşturup içine değer atamadan oluşturmak isterseniz, boyutunu belirlememiz gerekir

        int arr8[]=new int[5]; // java içinde 5 tane default değer olan bir array oluşturur
                                // [0,0,0,0,0]

    }
}
