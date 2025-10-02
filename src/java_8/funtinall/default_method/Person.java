package java_8.funtinall.default_method;

public interface Person {
    public void hello();
    default void bye(){
        System.out.println("hello default");
    }
}
