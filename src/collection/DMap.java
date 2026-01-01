package collection;

import java.util.HashMap;
import java.util.Map;

public class DMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1,"Amit");
        map.put(2,"raju");
        map.put(3,"raja");
        map.put(4,"vimal");
        System.out.println("All elements: ---------");

        for (Object obj : map.entrySet()) {
            Map.Entry entry = (Map.Entry) obj;  // 👈 type cast required
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
