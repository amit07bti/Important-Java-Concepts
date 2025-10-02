package java_8.funtinall;
@FunctionalInterface
public interface MyInterface {

    public void sayHello();
    default void sayBye(){

    };
    public  static void sayOk(){

    };

}
