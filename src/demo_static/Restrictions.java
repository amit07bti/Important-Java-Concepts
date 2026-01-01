package demo_static;

public class Restrictions {
    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {
        System.out.println(" main method   static block");
    }
}
