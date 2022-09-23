package Assignment_ClassesandObjects;


public class Euro_Main {

    public static void main(String[] args) {
    Euro teneuros = new Euro(10);
    Euro anotherteneuros = new Euro(10);
    System.out.println(teneuros.equals(anotherteneuros));
    Euro fiveeuros = new Euro(5);
    Euro twoeuros = new Euro(2);
    Euro seveneuros = new Euro(7);
    System.out.println((fiveeuros.sum(twoeuros)).equals(seveneuros));


   }
}