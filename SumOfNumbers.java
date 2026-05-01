import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sum Calculator ===");

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        int result = firstNumber + secondNumber;

        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is: " + result);

        scanner.close();
    }
}
