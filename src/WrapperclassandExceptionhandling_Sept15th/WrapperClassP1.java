package WrapperclassandExceptionhandling_Sept15th;

import java.util.Scanner;

public class WrapperClassP1 {
    public static void main(String args[]){
        int a;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        Integer i=a; //Boxing of int

        if(i instanceof Integer)
        {
            System.out.println(i);
            System.out.println("object of integer is created");
        }
        double b;
        b=sc.nextDouble();
        Double d=b; //Boxing of double
        if(d instanceof Double)
        {
            System.out.println(d);
            System.out.println("object of double is created");
        }
    }

}
