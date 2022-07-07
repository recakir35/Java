package lesson40_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex10_ {

	public static void main(String[] args) {

		// Soru: Verilen bir arraydeki tekrarli elemanlari silip, sadece unique degerlerden 
		// olusan bir liste haline getiren bir program yaziniz. 

		int arr[] = {1, 2, 3, 4, 4, 5, 7, 3, 4}; // mevcut Array

		Set<Integer> arrSet = new HashSet<Integer>(); // Set oluşturuyoruz. Set unique dir tekrarlı elemanları kabul etmez tekrarsıza çevirir
		for (int i = 0; i <arr.length ; i++) {// arraydeki elemanlar oluşturulan sete atılmak için döngü oluşturuluyor.
			arrSet.add(arr[i]); // arr tek tek sete atılıyor.
		}
		System.out.println("Mevcut Array: "+Arrays.toString(arr)); // array yazdırılıyor.
		System.out.println("Tekrarsız SetArray: "+arrSet);// set yazdırılıyor.

	}

}
