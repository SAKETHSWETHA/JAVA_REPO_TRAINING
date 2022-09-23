package JAVA_ASSIGNMENT1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class IPAddressValidator {
    boolean validateIP(String ip) {
        StringTokenizer tokenizer = new StringTokenizer(ip, ".");
        int x = Integer.parseInt(tokenizer.nextToken());
        int y = Integer.parseInt(tokenizer.nextToken());
        int z = Integer.parseInt(tokenizer.nextToken());
        int r = Integer.parseInt(tokenizer.nextToken());
        if ((x >= 0 && x <= 255) && (y >= 0 && y <= 255) && (z >= 0 && z <= 255) && (r > 0 && r < 255)){
            return true;
        }
      return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        IPAddressValidator ipAddressValidator = new IPAddressValidator();
        boolean b = ipAddressValidator.validateIP(ip);
        if (b){
            System.out.println("Valid IP address");
        }
        else {
            System.out.println("Not a valid IP address");
        }

    }
}