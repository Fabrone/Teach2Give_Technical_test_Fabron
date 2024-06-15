import java.util.Scanner;

public class DigitReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Digit Reverser!");
        System.out.println("Enter an integer to reverse its digits :");

        while (true) {
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("quit")) {
                break;
            }


            try {
                int number = Integer.parseInt(input);
                int reversedNumber = reverseDigits(number);
                System.out.println("Reversed number: " + reversedNumber);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }

            System.out.println("\nEnter another integer .Type 'quit' to exit:");
        }

        scanner.close();
    }

    public static int reverseDigits(int num) {
        int reversed = 0;
        int remaining = Math.abs(num);

        while (remaining > 0) {
            int digit = remaining % 10;
            reversed = reversed * 10 + digit;
            remaining /= 10;
        }

        return num < 0 ? -reversed : reversed;
    }
}