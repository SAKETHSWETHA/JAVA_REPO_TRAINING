package RuntimePolymorphism_Sept20th;

public class Bicycle_Main {
    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle();  // bicycle1 is object of type Bicycle class and it is an instance of Bicycle class;
        Bicycle bicycle2 = new MountainBicycle();//bicycle2 is object of type Bicycle class and it is an instance of MountainBicycle class;
        Bicycle bicycle3 = new RoadBicycle();
        bicycle1.writeDescription();
        bicycle2.writeDescription();  // mountainbicycle also has properties of bicycle
        bicycle3.writeDescription();

    }
}
