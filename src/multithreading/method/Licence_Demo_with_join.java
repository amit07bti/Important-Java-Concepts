package multithreading.method;


class  Medical extends  Thread{
    public  void run(){
        try {
            System.out.println("Medical  starts");
            Thread.sleep(8000);
            System.out.println("Medical completed");
            System.out.println("----------------------------------------------------------");
        }

        catch (Exception e) {

            System.out.println(e);
        }
    }


}

class  Drive extends  Thread{

    public void run(){
        try {
            System.out.println("Test Drive starts");
            Thread.sleep(6000);
            System.out.println("Test completed");
            System.out.println("-------------------------------------------------");

        }catch (Exception e){
            System.out.println(e);
        }
    }
}

class  OfficerSign  extends  Thread{

    public void run(){
        try {
            System.out.println("Officer takes the file");
            Thread.sleep(5000);
            System.out.println("Officer works completed ");
            System.out.println("--------------------------------------------------------------");


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class Licence_Demo_with_join {
    public static void main(String[] args) throws InterruptedException {

        Medical medical= new Medical();
        medical.start();

        medical.join();

        Drive   drive= new Drive();
        drive.start();

        drive.join();

        OfficerSign sign =new OfficerSign();
        sign.start();




















    }
}
