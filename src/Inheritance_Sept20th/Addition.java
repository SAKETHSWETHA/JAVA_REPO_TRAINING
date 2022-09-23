package Inheritance_Sept20th;

class Arthimetic {

}

class Adder extends Arthimetic{
    int a,b,c;
    int add( int a, int b)
    {
        c=a+b;
        return c;
    }
}

public class Addition{
    public static void main(String[] args) {
        Adder a = new Adder();
        System.out.println("My Super Class is "+a.getClass().getSuperclass().getName());
        System.out.println(a.add(30,12)+" "+a.add(6,7)+" "+a.add(12,8));
    }

}