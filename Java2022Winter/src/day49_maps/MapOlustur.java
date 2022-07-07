package day49_maps;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {
    public static Map<Integer, String> myMap() {
        Map<Integer, String> sinifList = new HashMap<>();
        sinifList.put(101, "Ali, Can, Dev, 1979");
        sinifList.put(102, "Veli, Yan, QA, 1969");
        sinifList.put(103, "Ali, Yan, C#, 1989");
        sinifList.put(104, "Ali, Can, Dev, 1999");
        sinifList.put(105, "Veli, Yan, QA, 2001");
        sinifList.put(106, "Ali, Yan, C#, 2005");
        sinifList.put(107, "Ali, Can, Dev, 2015");


        return sinifList;
    }
}
