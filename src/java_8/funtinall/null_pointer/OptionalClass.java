package java_8.funtinall.null_pointer;

public class OptionalClass {
    public static void main(String[] args) {
        String name = "hi , this is amit";

        if(name==null){
            System.out.println(" this is null object");
        }else {
            System.out.println(name.length());
        }
    }
}
