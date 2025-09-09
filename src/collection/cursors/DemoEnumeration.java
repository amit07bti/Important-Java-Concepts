package collection.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class DemoEnumeration {

    public static void main(String[] args) {

        Vector v= new Vector();
        v.add(12);
        v.add("Amit");
        v.add(20);
        System.out.println(v);
        Enumeration e=v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
