package oops_java;

public class DemoClass {

    public static void main(String[] args) {
        Class  c= DemoClass.class;
        System.out.println(c.getClassLoader());
        System.out.println(String.class.getClassLoader());


    }
}
