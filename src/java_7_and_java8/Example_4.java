package java_7_and_java8;
@FunctionalInterface
public interface Example_4 {

    public  void add();

    default  String sayHi(){
        return "Hi";
    }
    static boolean isTrue(){
        return true;
    }

}
