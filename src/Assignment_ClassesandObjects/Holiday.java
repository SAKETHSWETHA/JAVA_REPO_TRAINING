package Assignment_ClassesandObjects;

import java.util.ArrayList;

public class Holiday {
    String name;
    int day;
    String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public Holiday() {

    }


    boolean inSameMonth(Holiday h1, Holiday h2) {
        if (h1.month.equalsIgnoreCase(h2.month))
            return true;
        return false;
    }


    double avgDate(ArrayList<Holiday>arrayList) {
      int sum=0;
      for(Holiday h : arrayList){
          sum+=h.day;
      }
      return ((double) sum/arrayList.size());

    }

    }
    /* or by using arrays
        double avgDate(Holiday[]holiday)
        int sum = 0;
        for (int i = 0; i < holiday.length; i++) {
            sum += holiday[i].day;
        }
        return ((double) sum / holiday.length);
    }*/


