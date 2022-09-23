package StringsandArrays_Sept14th;

import java.lang.Math;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        double Random_num = Math.random();
        double x;
        do {
            System.out.println(Random_num);
            Scanner sc = new Scanner(System.in);
            x = sc.nextDouble();
            if (x > Random_num) {
                System.out.println("Too high, try again.");
            } else if(x<Random_num){
                System.out.println("Too low, try again.");
            }
            else{
                System.out.println("You got it");
            }
        } while (x == Random_num);


    }
}
