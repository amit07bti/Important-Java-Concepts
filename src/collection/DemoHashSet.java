package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class DemoHashSet {
    public static void main(String[] args) {

        ArrayList br= new ArrayList();
        br.add("rahul");
        br.add("jafer");
        br.add("mohit");
        br.add("rahul");
        br.add("jafer");
        br.add("mohit");

        HashSet hs = new HashSet(br);

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);


        System.out.println(hs.size());
     //  Iterator tc= hs.iterator();
//
//      while (tc.hasNext()){
//          System.out.println(hs.hashCode());
//          System.out.println(tc.next());
//          System.out.println(br     .hashCode());
//          System.out.println("--------------------------------------------------------f");
//      }

    }

}
