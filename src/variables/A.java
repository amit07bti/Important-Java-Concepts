package variables;

public class A {

int a=10;



}
class B extends A{
    int b=20;

    void show(int a){
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);

    }
    public static void main(String[] args) {
        B ob = new B();
        ob.show(30);

    }
}
