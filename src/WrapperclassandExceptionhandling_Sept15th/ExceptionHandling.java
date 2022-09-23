package WrapperclassandExceptionhandling_Sept15th;

public class ExceptionHandling {
/*Three types of exception--> Checked,Unchecked,Errors
    Checked-->Syntax errors
    Unchecked--> 1/0
    */

/* Using method signature-- It is used when the code is big...
import java.io.FileReader;
public class Exception_Handling {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("file.txt");

    }

}*/


/*Using try-catch block...
import java.io.FileReader;
public class Exception_Handling {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("file.txt");
        }
        catch(Exception exception){
            System.out.println(exception.getMessage());
        }

    }
}



/*Custom Exception
public class Exception_Handling {
    public static void main(String[] args) {
        int x=10;
        try{
            if(x<15){
                throw new CustomExp("x less than 15");
            }
            else
                System.out.println(x);
        }
        catch(CustomExp exp)
        {
            System.out.println((exp.getMessage()));
        }
    }
    }
    */

}
