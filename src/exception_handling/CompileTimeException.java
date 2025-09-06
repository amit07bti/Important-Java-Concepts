package exception_handling;

import java.io.FileInputStream;

public class CompileTimeException {
    public static void main(String[] args) {



//            FileInputStream  fis = new FileInputStream("D:\\xyz.txt.docx");
//  todo  compile time exception--> complier will check at a compile and indicate please handle that exception .

//             Class.forName("com.mysql.jdbc.Driver");


        int a=100, b=0, c;      //todo runtime exception -> compiler will not able to check  while compile of program it will occures when run your program
        c=a/b;
        System.out.println(c);

    }
}
