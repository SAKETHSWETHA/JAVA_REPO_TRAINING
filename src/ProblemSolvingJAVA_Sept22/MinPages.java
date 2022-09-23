package Problems;

import java.util.Scanner;


public class MinPages {
    public int pageCount(){
        int n,p,mid;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of pages: ");
        n = sc.nextInt();
        System.out.println("Page number to be found: ");
        p = sc.nextInt();
        mid = ((n+1)/2);

        if(p<mid){
            return (p/2);
        }
        else {
            return  ((n-p)/2);
        }
    }


    public static void main(String[] args) {

        MinPages minPages = new MinPages();
        System.out.println("Minimum no.of pages to be turned is "+minPages.pageCount());
    }
}

