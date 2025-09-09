package collection;

import java.util.ArrayList;

public class DemoCollection {
    public static void main(String[] args) {

        ArrayList list1= new ArrayList();

          list1.add("aaa");
          list1.add("bbb");
          list1.add("ccc");


          System.out.println(list1);

          ArrayList list2= new ArrayList();
          list2.add("aaa");
          list2.add("bbb");
          list2.add(300);

          list1.removeAll(list2);

        System.out.println(list1);
        System.out.println(list2);
           list1.clear();
        System.out.println(list1);













    }
}
