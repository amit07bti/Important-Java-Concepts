package java_8.funtinall.static_method;

interface A{
     static void sayHello(){
         System.out.println("Hello");
    }
}

public class MyClass implements A {
    public static void main(String[] args) {
        MyClass ob= new MyClass();
        //ob.sayHello
        //MyClass.sayHello
        A.sayHello();

    }
}
