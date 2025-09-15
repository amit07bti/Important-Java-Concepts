package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map map= new HashMap();

        map.put(101,"Amit");
        map.put(102,"Deepak");
        map.put(103,"Deepak");
        map.put(null,null);
        map.put(null,"aaa");


        System.out.println(map);










    //    map.clear();
      //  System.out.println(map.containsKey(103));
       // System.out.println(map.containsValue("Amit"));
       // System.out.println(map);
       // map.remove(103);

     //   System.out.println(map);
        //System.out.println(map.get(102));
     //   map.replace(103,"Raj");
    //    System.out.println(map);

    }
}
