package exception_handling;

import java.io.FileInputStream;

public class CompileTimeException {
    public static void main(String[] args) {


        try{
            FileInputStream  fis = new FileInputStream("D:\\xyz.txt.docx");
            System.out.println("print:  "+fis);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
