package collection;

import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public class DLinkedList {
    public static void main(String[] args) {

        LinkedList list= new LinkedList();
        list.add(1);
        list.add(45.5);
        list.add(4);
        list.add(5);

        System.out.println(list );

        ConcurrentHashMap s= new ConcurrentHashMap<>();
        s.put(1,"Amit");
        s.put(2,"raj");
        s.put(2,"m");
        s.put(5,"aman");
        System.out.println(s);

    }
}
