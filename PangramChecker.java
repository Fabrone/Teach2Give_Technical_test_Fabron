import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Pangram Checker!");
        System.out.println("Enter a sentence to check if it's a pangram :");

        while (true) {
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            boolean isPangram = isPangram(input);
            if (isPangram) {
                System.out.println("The input is a pangram.");
            } else {
                System.out.println("The input is not a pangram.");
            }

            System.out.println("\nEnter another sentence .Type 'quit' to exit:");
        }

        scanner.close();
    }

    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        Set<Character> letters = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.add(c);
            }
        }

        return letters.size() == 26;
    }
}