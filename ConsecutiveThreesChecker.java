import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ConsecutiveThreesChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Consecutive Threes Checker!");
        System.out.println("Enter a list of integers separated by spaces :");

        while (true) {
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            try {
                List<Integer> numbers = Arrays.stream(input.split("\\s+"))
                                              .map(Integer::parseInt)
                                              .collect(Collectors.toList());

                boolean hasConsecutiveThrees = hasConsecutiveThrees(numbers);
                System.out.println("Contains consecutive threes: " + hasConsecutiveThrees);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter integers separated by spaces.");
            }

            System.out.println("\nEnter another list of integers .Type 'quit' to exit:");
        }

        scanner.close();
    }

    public static boolean hasConsecutiveThrees(List<Integer> numbers) {
        if (numbers == null || numbers.size() < 2) {
            return false;
        }

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) == 3 && numbers.get(i + 1) == 3) {
                return true;
            }
        }

        return false;
    }
}