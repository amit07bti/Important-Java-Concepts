package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        Set s= new HashSet<>();
        s.add(100);
        s.add(200);
        s.add(300);
        s.add(400);
        s.add(null);
        //System.out.println(s);
       Iterator str= s.iterator();
       while (str.hasNext()){
           System.out.println("before:  "+str.hashCode());
           System.out.println(str.next());
           System.out.println("after:  "+str.hashCode());
           System.out.println("--------------------------------------------");
       }

    }
}
