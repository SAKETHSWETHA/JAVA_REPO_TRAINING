package ProblemSolvingJAVA_Sept22;

import java.util.Scanner;

public class CountSay {
    public String countAndSay(int n) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        char index;

        for (int i = 0; i < 9; i++) {
            arr1[i] = i + 1;
        }
        for (int i = 0; i < 9; i++) {
            arr1[i] = 0;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        for (int i=0;i<str.length();i++)
        {
            index= str.charAt(i);

        }

        return str;
    }
}
