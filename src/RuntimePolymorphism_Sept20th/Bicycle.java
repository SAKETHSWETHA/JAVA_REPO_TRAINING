package RuntimePolymorphism_Sept20th;

public class Bicycle {
    int speed;
    int cadence; //Similar to RPM.
    int gear;

    public void writeDescription(){
        System.out.println("Bicycle has "+speed+" "+"with"+cadence+" "+"in"+gear);
    }

}
