package RuntimePolymorphism_Sept20th;

public class RoadBicycle extends Bicycle{
    String tyre;
    int width;

    @Override
    public void writeDescription() {
        System.out.println("Road Bicycle has "+tyre+" "+"and "+width);
    }
}
