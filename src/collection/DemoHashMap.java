package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoHashMap {
    public static void main(String[] args) {

        HashMap<Integer,String> hm= new HashMap();

        hm.put(101,"amit");
        hm.put(102,"radha");
        hm.put(103,"mohan");
        hm.put(104,"rajkumar");

        System.out.println(hm);

        for (Map.Entry me: hm.entrySet()){
            System.out.println(me.getKey()+"->  "+me.getValue());


        }










//     Set set=  hm.entrySet();
//        System.out.println(set);
//
//        Iterator itr=set.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
//










    }
}
