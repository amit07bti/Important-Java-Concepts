package this_keyword;

public class Demo_this {
    int i;


    public  void setValue(int i){
        this.i=i;

    }

    public  void show(){
        System.out.println(i);
    }
}
class XYZ{
    public static void main(String[] args) {

        Demo_this s= new Demo_this();
        s.setValue(6);
        s.show();
    }
}
