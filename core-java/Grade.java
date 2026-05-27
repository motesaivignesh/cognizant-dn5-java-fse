import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks (0-100): ");
        int marks = scanner.nextInt();
        char grade;
        if (marks >= 90 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 80 && marks < 90) {
            grade = 'B';
        } else if (marks >= 70 && marks < 90) { 
            grade = 'C';
        } else if (marks >= 60 && marks < 70) {
            grade = 'D';
        } else if (marks >= 0 && marks < 60) {
            grade = 'F';
        } else {
            System.out.println("Invalid marks entered! Please run the program again.");
            scanner.close();
            return;
        }
        
        System.out.println("The assigned grade is: " + grade);
        scanner.close();
    }
}
