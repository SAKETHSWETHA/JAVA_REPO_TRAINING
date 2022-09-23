package ConditionalStatements_Sept13th;
import java.util.Scanner;

public class GreatestofThree {
        public static void main(String[] args) {
            float x,y,z,temp,large;
            Scanner sc = new Scanner(System.in);
            x = sc.nextFloat();
            y = sc.nextFloat();
            z = sc.nextFloat();
// Finding greatest of 3 without using AND operator
            if(x>y){
                temp=x;
            }
            else{
                temp=y;
            }

            if(z>temp){
                large=z;
            }
            else{
                large=temp;
            }
            System.out.println("Largest Number among 3 is "+large);
        }
    }

