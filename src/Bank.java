public class Bank {
    int getRateOfInterest(){
        return 0;
    }
}

class ICICI extends  Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class SBI extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}
class HDFC extends Bank{
    int getRateOfInterest(){
        return 9;

    }

}class A{
    protected void msg(){
        System.out.println("Hello java");
    }
}

