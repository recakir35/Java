package lesson41_maps;

import lesson41_maps.MapOlustur;

import java.util.Map;
import java.util.Set;

public class C05_Update {
    // Verilen map'deki tum branslari Java yapalim
    /* Map'de valu kompleks olabildiği için valu içinden bir şeyi değiştirmek istersek
    once value'ye ulaşmak sonra onu manipule ederek istediğimiz değişikliği yapmak ve değişmiş halini
    yeniden map'e eklemek gerekir.
     */
    public static void main(String[] args) {
        Map<Integer, String> sinifListMap = MapOlustur.myMap(); // Bir method ile bir Map oluşturur
        System.out.println(sinifListMap);                       // Oluşan Map Yazdırılıyor.
        Set<Map.Entry<Integer, String>> sinifEntrySet = sinifListMap.entrySet();
        for (Map.Entry<Integer, String> each : sinifEntrySet
        ) {
            Integer keyEntry = each.getKey();
            String valueEntry = each.getValue();
            String valueArr[] = valueEntry.split(", ");
            valueArr[2] = "Java";
            String valueYeni = valueArr[0] + ", " + valueArr[1] + ", " + valueArr[2] + ", "
                    + valueArr[3];
            sinifListMap.put(keyEntry, valueYeni);
        }
        System.out.println(sinifListMap);
    }
}
