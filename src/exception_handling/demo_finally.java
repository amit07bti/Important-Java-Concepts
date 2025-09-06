package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class demo_finally {
    public static void main(String[] args) throws IOException {
        System.out.println("1");
        FileInputStream fis= null;
        System.out.println("2");

        try{
            System.out.println("3");
            fis= new FileInputStream("D:\\xyz.txt.docx");
            System.out.println("4");
        }catch (FileNotFoundException e){
            System.out.println("5");                       //System.exit()  -> even not execute finally block also
            System.out.println("File Not Found");
            System.out.println("6");
        }
        finally {
            System.out.println("7");
            if(fis!=null){
                System.out.println("8");
                fis.close();
                System.out.println("9");
            }
            System.out.println("10");
            System.out.println("File closed");
            System.out.println("11");

        }



    }
}
