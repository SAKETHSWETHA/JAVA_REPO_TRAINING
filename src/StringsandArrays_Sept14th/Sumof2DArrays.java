package StringsandArrays_Sept14th;

import java.util.Scanner;

public class Sumof2DArrays {

    public static void main(String[] args) {
            int i,j;
            int[][] arr1 = new int[10][10];
            int[][] arr2 = new int[10][10];
            int[][] arr3 = new int[10][10];
            Scanner sc = new Scanner(System.in);

            for(i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                {
                    arr1[i][j]=sc.nextInt();
                }
            }

            for(i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                {
                    arr2[i][j]=sc.nextInt();
                }
            }

            System.out.println("\n");
            for(i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                {
                    arr3[i][j]=arr1[i][j]+arr2[i][j];
                    System.out.print(arr3[i][j]+" ");
                }
                System.out.print("\n");
            }


        }

}

