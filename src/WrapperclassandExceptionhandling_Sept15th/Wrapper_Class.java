package WrapperclassandExceptionhandling_Sept15th;

public class Wrapper_Class {
    public static void main(String[] args) {
        int a = 9;
        double d = 6.78;
        //auto-boxing of int object
        Integer i = a;
        //auto-unboxing of int object
        int j = i;
        System.out.println(i+" "+j);

        //auto-boxing of double object
        Double k = d;
        //auto-unboxing of double object
        double r = k;
        System.out.println(k+" "+r);

    }
}
