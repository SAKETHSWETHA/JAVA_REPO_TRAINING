package Assignment_ClassesandObjects;


import java.util.ArrayList;

public class Movie_Main {
    public static void main(String[] args) {
        Movie m1 = new Movie("RRR", "DVV", "PG");
        Movie m2 = new Movie("Vikram", "Kamal", "PG");
        Movie m3 = new Movie("One", "GMB");
        Movie m4 = new Movie("Pushpa", "Geetha Arts", "PG");
        Movie m5 = new Movie("CasinoRoyale","EON Productions","PG-13");

        ArrayList<Movie>al = new ArrayList<>();
        al.add(m1);
        al.add(m2);
        al.add(m3);
        al.add(m4);
        System.out.println(m1.getPG(al));
        System.out.println(m5.title+" "+m5.studio+" "+m5.rating);

    }
}
