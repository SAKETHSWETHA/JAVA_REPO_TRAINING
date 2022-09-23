package WrapperclassandExceptionhandling_Sept15th;

import java.util.Scanner;

public class HeightExample {
    public static void main(String[] args) {
            int height;
            Scanner sc = new Scanner(System.in);
            height = sc.nextInt();
            try
            {
                if(height<120)
                {
                    throw new CustomExp("Not eligible for roller-coaster ride");
                }
                else{
                    System.out.println(height);
                }
            }
            catch (CustomExp exp)
            {
                System.out.println("Got the exception" +exp.getMessage());
            }

        }

    }


