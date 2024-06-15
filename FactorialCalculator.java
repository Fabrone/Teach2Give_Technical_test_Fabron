//Write a recursive function to calculate the factorial of a number

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Factorial Calculator!");
        System.out.println("Enter a non-negative integer :");

        while (true) {
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                if (number < 0) {
                    System.out.println("Factorial is not defined for negative numbers.");
                } else {
                    long result = factorial(number);
                    System.out.println("The factorial of " + number + " is: " + result);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a non-negative integer.");
            }

            System.out.println("\nEnter another number or Type quit to exit:");
        }

        scanner.close();
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        
        return n * factorial(n - 1);
    }
}