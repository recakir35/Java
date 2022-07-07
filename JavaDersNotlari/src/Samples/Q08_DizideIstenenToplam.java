package practice_free2;

public class Q08_DizideIstenenToplam {
    /*
     * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
     * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
     * istenenToplam=9;
     */
    public static void main(String[] args) {
        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j < arr.length; j++) {
                if (istenenToplam==arr[i]+arr[j]){
                    System.out.println(arr[i]+" + "+ arr[j] +" = "+ (arr[i]+arr[j]));
                }
            }

        }
    }

}
