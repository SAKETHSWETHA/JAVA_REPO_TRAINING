package WrapperclassandExceptionhandling_Sept15th;
import java.util.Scanner;

public class CalculatorwithException {
    public static void main(String[] args) {
        int a, b, result;
        char ch;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter the operation to be performed: ");
        ch = sc.next().charAt(0);

        switch (ch) {
            case '+':
                result = a + b;
                System.out.println(result);
                break;
            case '-':
                result = a - b;
                System.out.println(result);
                break;
            case '*':
                result = a * b;
                System.out.println(result);
                break;
            case '/':
                try {
                    result = a / b;
                    System.out.println(result);
                    break;
                } catch (Exception e) {
                    System.out.println("Division by zero not possible" + e.getMessage());
                }
            default:
                System.out.println("Operation is unknown.Please Re-check.");
                break;
        }
    }
}
