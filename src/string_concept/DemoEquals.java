package string_concept;

public class DemoEquals {
    public static void main(String[] args) {

//        String s1="A";                   //a=97
//        String s2= "a";                  //A=65
//
//        System.out.println(s1.compareTo(s2));
        String s1="amit";
       String s2= " java";
//        System.out.println(s1+s2);
//        System.out.println(s1+10);
//        System.out.println(s1+10+20);
//        System.out.println(20+s1);
//        System.out.println(20+10+s1);
//        System.out.println(s1+20/10);
//        System.out.println(s1+2*4);
        System.out.println(s1.concat(s2));
        System.out.println(String.join("=",s1,s2,s1,s2,s1,s1));


    }
}
