package Encapsulation_Presentation;


public class Rectangle {

    private int length;
    private int breadth;

    //Setter
    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    //Getter
    public int getLength() {
        return this.length;
    }

    public int getBreadth() {
        return this.breadth;
    }

    public int area(){
        return length*breadth;
    }

    public int perimeter(){
        return 2*(length+breadth);
    }
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

}
