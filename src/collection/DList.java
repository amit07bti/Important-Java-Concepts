package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DList {
    public static void main(String[] args) {

        List  list= new ArrayList();
        list.add(3);
        list.add(2);
        list.add(5);
        list.add("Amit");
        list.add(null);
        list.add(1);

        System.out.println(list);

      Iterator i= list.iterator();
      while (i.hasNext()){
          System.out.println(i.next());
      }

      List name= new ArrayList<>();
        name.add("AMIT");
        name.add("RAJU");
        name.add("MOHIT");
        name.add(2);



    }
}
