package JAVA_ASSIGNMENT1;

import java.util.Scanner;

public class AreaOfContainer {
    public int maxArea(int[] height) {


        int area = 0;

        for (int i = 0; i < height.length; i++) {

            for (int j = i + 1; j < height.length; j++) {

                int a = (j - i) * (Math.min(height[i], height[j]));
                area = Math.max(area, a);

            }

        }
        return area;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of bars: ");
        int n = sc.nextInt();
        int[] height = new int[n];
        for (int i = 0; i < height.length; i++) {
            height[i] = sc.nextInt();
        }
       AreaOfContainer areaOfContainer = new AreaOfContainer();
        System.out.println("Max area is "+areaOfContainer.maxArea(height));
    }
}

