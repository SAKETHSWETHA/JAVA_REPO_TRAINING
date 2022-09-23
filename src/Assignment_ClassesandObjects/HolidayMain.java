package Assignment_ClassesandObjects;


import java.util.ArrayList;

public class HolidayMain {
    public static void main(String[] args) {
        Holiday hol = new Holiday();
        Holiday h1 = new Holiday("Diwali", 25, "October");
        Holiday h2 = new Holiday("Dusherrah", 5, "october");
        Holiday h3 = new Holiday("Independence-Day", 15, "August");
        Holiday h4 = new Holiday("Ganesh-Chaturthi", 31, "August");
        ArrayList<Holiday> al = new ArrayList<>();
        al.add(h1);
        al.add(h2);
        al.add(h3);
        al.add(h4);

        System.out.println(h1.inSameMonth(h1, h2));
        System.out.println(h1.avgDate(al));

    }
}