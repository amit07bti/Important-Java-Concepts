package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class DemoLinkedList {
    public static void main(String[] args) {

        ArrayList l=new ArrayList();
        l.add(100);
        l.add(200);
        l.add(300);
        LinkedList ll= new LinkedList(l);

        ll.add("Amit");
        ll.add("Rahul");
        ll.add("karan");
        ll.add(10);
        ll.add(20.455);

        System.out.println(ll);

        Vector v = new Vector<>();
        v.add(90);
        v.add(50);
        v.add(90);
        v.add(50);
        v.add(90);
        v.add(50);

        System.out.println("vector:   "+v.capacity());

        Stack s = new Stack();
        s.add(100);
        s.add(200);
        s.add(300);
        s.add(400);
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);



    }
}
