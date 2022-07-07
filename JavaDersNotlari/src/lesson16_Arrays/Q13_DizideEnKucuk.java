package lesson16_Arrays;

public class Q13_DizideEnKucuk {
    public static void main(String[] args) {
        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */
        int arr[][] = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 1, 3}};
        int minnumber=5;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (minnumber>arr[i][j]){
                    minnumber=arr[i][j];
                }
            }
        }
        System.out.println("Dizinin En Küçük Elemanı: "+minnumber);
    }
}
