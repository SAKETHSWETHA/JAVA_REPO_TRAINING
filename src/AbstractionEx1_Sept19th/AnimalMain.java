package AbstractionEx1_Sept19th;

public class AnimalMain {
    public static void main(String[] args) {
        Goat goat = new Goat();
        goat.shout();
        Turtle turtle = new Turtle();
        turtle.shout();
        System.out.println(turtle.swims());
    }
}
