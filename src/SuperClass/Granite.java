package SuperClass;

public class Granite extends Tile{


    public Granite() {
        super.occupySpace();
    }

    @Override
    void occupySpace() {
        super.occupySpace();
        //super.randomMethod();
        System.out.println("Granite occupies space");
    }
}
