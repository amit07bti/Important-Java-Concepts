package exception_handling;

public class Trace_exception_info {

    public static void main(String[] args) {


        try {
            int a=100, b=0, c;
            c=a/b;
            System.out.println(c);

        }catch (ArithmeticException e){
//            e.printStackTrace();      //todo mostly use in industry   this : printStackTrace();
//            System.out.println(e);
//            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println("hello");

        }
    }
}
