package collection;

import java.util.TreeSet;

public class DemoTreeSet {
    public static void main(String[] args) {

        TreeSet set= new TreeSet();
//        set.add(10);
//        set.add(40);
//        set.add(20);
//        set.add(30);

//        set.add("ram");
//        set.add("sita");
//        set.add("amit");
//        set.add("abhitabh");
//        set.add("arun");
//        set.add("babita");

//        set.add(23.56);
//        set.add(24.34);
//        set.add(23.36);
//        set.add(23.50);
//        set.add(null);   todo :  NullPointerException


        set.add(23.56);
        set.add(34.56);
        set.add(23.66);
       // set.add('c');    todo:  ClassCastException

set.remove(23.56);

        System.out.println(set);
    }
}
