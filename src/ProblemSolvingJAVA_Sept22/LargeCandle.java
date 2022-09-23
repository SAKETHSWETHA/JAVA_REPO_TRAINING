package ProblemSolvingJAVA_Sept22;

import java.util.Scanner;

public class LargeCandle {
    int birthdayCakeCandles(int[] candles, int n) {
        int max = candles[0];
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (candles[i] > max) {
                max = candles[i];
            } else if (candles[i] == max) {
                max = candles[i];
                count++;
            }
        }
      return count;
    }

    public static void main(String[] args) {
        int n;
        int[] candles = new int[4];
        System.out.println("Enter the number of candles:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter the height of candles:");
        for (int i = 0; i < n; i++) {
            candles[i] = sc.nextInt();
        }
        LargeCandle l = new LargeCandle();
        int x =l.birthdayCakeCandles(candles,4);
        System.out.println(x);
    }
}
