package ConditionalStatements_Sept13th;
import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
            int x,y,res;
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();
            y = sc.nextInt();
            res=(x>y)? x : y;
            System.out.println("Greatest is "+res);
        }
    }

