package lesson11_MethodCreation;

import java.util.Scanner;

public class Q12_AsalCarpan {
	static 	int bolen=1;
	static boolean isAsal=false;
	

	public static void main(String[] args) {
		/* TASK :
		 * Pozitif bir tamsayıyı input kabul edip en büyük asal çarpanını veren bir
		 * METHOD create ediniz.
		 * 
		 * Ör: Input : 50 
		 *     Bolenler : 2,5,10,20,50 
		 *     Asal Bolenler: 2,5 
		 *     En buyuk asal carpan: 5
		 */
		Scanner scan=new Scanner(System.in);
		System.out.print("Sayı Giriniz: ");
		int sayi=scan.nextInt();

		asalCarpan(sayi);

	}

	private static void asalCarpan(int sayi) {
		int asalbolen=0;
		for (int i = 2; i <= sayi; i++) {
			if (sayi%i==0){
				bolen=i;
				asalMı(bolen);
				asalbolen=bolen;
			}

		}
		System.out.println("Girdiğiniz sayının enbüyük asal böleni: "+asalbolen);
	}

	private static boolean asalMı(int bolen) {
		for (int i = 2; i < bolen ; i++) {
			if (bolen%i==0){
				isAsal=false;
				break;
			}
		}
		return isAsal;
	}


}