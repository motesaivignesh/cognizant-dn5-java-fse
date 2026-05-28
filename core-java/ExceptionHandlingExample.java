import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first integer (dividend): ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second integer (divisor): ");
        int num2 = scanner.nextInt();
        
        try {
            int result = num1 / num2;
            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
        
        scanner.close();
    }
}
