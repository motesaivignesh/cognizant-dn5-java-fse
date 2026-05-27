
import java.util.Scanner;

public class Guessnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetNumber = (int) (Math.random() * 100) + 1;
        int guess = 0;
        
        System.out.println("Welcome! I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess what it is?");
        
        while (guess != targetNumber) {
            System.out.print("\nEnter your guess: ");
            guess = scanner.nextInt();
            
            if (guess > targetNumber) {
                System.out.println("Too high! Try a lower number.");
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try a higher number.");
            } else {
                System.out.println("You got it!");
            }
        }
        
        scanner.close();
    }
}
