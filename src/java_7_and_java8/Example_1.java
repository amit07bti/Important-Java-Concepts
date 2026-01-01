package java_7_and_java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example_1 {
    public static void main(String[] args) {

        List<String> names= Arrays.asList("Mango","Banana","Apple","Mango");

       // Before

        List<String> uniqList=new ArrayList<>();
        for (String name: names){
            if (!uniqList.contains(name)){
                uniqList.add(name);
            }
        }
        System.out.println("Uniq List:  "+uniqList);

        //After
         List<String> uniuqueList=names.stream()
                 .distinct()
                 .collect(Collectors.toList());
        System.out.println("Unique List from java8  :  "+uniuqueList);


    }
}
