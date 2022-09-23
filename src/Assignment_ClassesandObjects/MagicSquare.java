package Assignment_ClassesandObjects;

import java.util.Scanner;

public class MagicSquare {
    public boolean magic(int[][] arr, int r, int c) {

        //Check whether diagonal sum is equal...
        int diagsum1 = 0, diagsum2 = 0;
        for (int i = 0; i < r; i++) {
            diagsum1 += arr[i][i];
            diagsum2 += arr[i][r - 1 - i];
        }
        if (diagsum1 == diagsum2) {
            for (int i = 0; i < r; i++) {
                int rowsum = 0;
                int colsum = 0;
                for (int j = 0; j < r; j++) {
                    rowsum += arr[i][j];
                    colsum += arr[j][i];
                }
                if (rowsum != colsum) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, columns;
        int[][] array = new int[10][10];

        System.out.println("Enter no.of rows: ");
        rows = sc.nextInt();
        System.out.println("Enter no.of columns: ");
        columns = sc.nextInt();

        if (rows != columns) System.out.println("Magic matrix should have equal rows and columns. Please enter again.");

        System.out.println("Enter the matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        MagicSquare m = new MagicSquare();
        boolean flag = m.magic(array, rows, columns);

        if (flag) {
            System.out.println("Matrix is magic square");
        } else {
            System.out.println("Matrix is not a magic square");
        }
    }
}
