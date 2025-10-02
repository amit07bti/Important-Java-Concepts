package equality;

public class DemoHashcodeAndEquals {
    public static void main(String[] args) {
        Student obj1= new Student("Amit",1);
        Student obj2= new Student("Amit",1);

        if(obj1.equals(obj2)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

        System.out.println("Hashcode of obj1:  "+obj1.hashCode());
        System.out.println("Hashcode of obj2:  "+obj2.hashCode());


    }
}
