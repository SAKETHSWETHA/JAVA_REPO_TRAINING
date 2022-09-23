package CompiletimePolymorphism;

public class Area_Main {
    public static void main(String[] args) {
        Area a = new Area();
        System.out.println("Area of square is " + a.area(10));
        System.out.println("Area of circle is " + a.area(10.5));
        System.out.println("Area of  rectangle is " + a.area(10, 20));
        System.out.println("Area of cuboid is " + a.area(10, 20, 30));
    }
}
