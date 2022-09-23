package Assignment_ClassesandObjects;

import java.util.ArrayList;

public class Movie {
    String title;
    String studio;
    String rating;

    public Movie(String title,String studio,String rating){
        this.title =title;
        this.studio =studio;
        this.rating=rating;
    }


    public Movie(String title,String studio){
        this.title =title;
        this.studio =studio;
        this.rating="PG";
    }


    //getPG Method
    public ArrayList<String> getPG(ArrayList<Movie> arrayList){
        ArrayList<String> arrayList1= new ArrayList<>();

        for(Movie m : arrayList){
            if(m.rating=="PG"){
             arrayList1.add(m.title);
            }
        }

        return arrayList1;
    }


}
