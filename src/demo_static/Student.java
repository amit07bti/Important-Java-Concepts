package demo_static;

public class Student {
    String name;
    int rollNo;
   static String college="rajendra Inter college";



    static void change(){
        college = "BBDIT";
    }
    public Student(String n, int r){
        name=n;
        rollNo=r;
    }
    public  void display(){
        System.out.println(name +": "+ rollNo+": "+ college );
    }
}


class Test{
    public static void main(String[] args) {
        Student.change();
        Student s1= new Student("Amit",101);
        Student s2= new Student("Idd mohhmadd",102);
       // Student.college="PS INTER COLLEGE";
        s1.display();
        s2.display();
    }
}
