package variable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StaticDemo {
    public static void main(String[] args) {

        Map<Integer,String> fruites= new HashMap<>();
        fruites.put(1,"apple");
        fruites.put(2,"banana");
        fruites.put(3,"carrot");
        fruites.put(4,"mango");

//        Iterator<Map.Entry<Integer,String>> iterator=fruites.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<Integer,String> entry= iterator.next();
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }

//        fruites.forEach((key,value) ->{
//            System.out.println(key);
//            System.out.println(value);
//        });
        fruites.entrySet().stream().forEach((entry)->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });

    }
}
