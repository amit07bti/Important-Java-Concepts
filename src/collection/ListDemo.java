package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List l= new ArrayList();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println(l);
        System.out.println(l.indexOf(40));

        Iterator itr= l.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
            System.out.println("stop");
        }
        System.out.println("exit");

        l.add(23);
        System.out.println(l    );
    }
}
