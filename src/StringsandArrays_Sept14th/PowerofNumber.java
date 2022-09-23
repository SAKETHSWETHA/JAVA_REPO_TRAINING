package StringsandArrays_Sept14th;

import java.util.Scanner;

public class PowerofNumber {
    public static void main(String[] args) {
        int base,exponent,power=1;
        Scanner sc = new Scanner(System.in);
        base = sc.nextInt();
        exponent = sc.nextInt();

        for (int i = 1; i <= exponent; i++) {
            power = power * base;
        }
        System.out.println(power);
    }
}

