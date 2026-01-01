package demo_static;

public class Demo_A {
    int id;
    String name;

    public  Demo_A(int id , String name){
        id=id;
        name=name;

    }
    public void display(){
        System.out.println("Student ID: "+id);
        System.out.println("Student Name: "+name);
    }
}
class Main{
    public static void main(String[] args) {
        Demo_A d1= new Demo_A(101,"Amit kumar");
        Demo_A d2= new Demo_A(102,"Rajit");
        d1.display();
        d2.display();
    }
}
