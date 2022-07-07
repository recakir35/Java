package lesson42_exercise;

public class TR_For_while_3 {
    public static void main(String[] args) {
        /*
        Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
        Input : String str=“Javaisalsoeasy”
        Output: a s
         */

        String str="Javacokguzelbirders";
        System.out.print("Tekrarlanan Harfler: ");
        for (int i = 0; i <str.length(); i++) {
            for (int j = i+1; j <str.length(); j++) {
                if (str.substring(i,i+1).equals(str.substring(j,j+1))) {
                    System.out.print(str.charAt(i)+" ");
                };
            }

        }
    }
}
