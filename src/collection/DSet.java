package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DSet {

    public static void main(String[] args) {
        Set <Integer>set = new HashSet();
        set.add(4);
        set.add(1);
        set.add(null);
        set.add(null);
        set.add(5);
        set.add(2);
        System.out.println(set);

       Iterator i= set.iterator();
       while (i.hasNext()){
           System.out.println(i.next());
       }

    }
}
