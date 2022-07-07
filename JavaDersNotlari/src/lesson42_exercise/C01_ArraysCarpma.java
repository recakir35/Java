package lesson42_exercise;

public class C01_ArraysCarpma {
    public static void main(String[] args) {
        //Soru 1 ) Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana
        //yazdiran bir method yaziniz. { { 1,2,3}, {4,5,6}

        int arr[][]={{ 1,2,3}, {4,5,6}};
        int carpma=1;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                carpma*=arr[i][j];
            }

        }
        System.out.println("verilen dizinin elemanlar çarpımı: "+carpma);
    }
}
