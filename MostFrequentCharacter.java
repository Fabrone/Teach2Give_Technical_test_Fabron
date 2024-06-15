import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Most Frequent Character Finder!");
        System.out.println("Enter a string :");

        while (true) {
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            if (!input.isEmpty()) {
                char mostFrequent = findMostFrequentChar(input);
                System.out.println("The most frequent character is: '" + mostFrequent + "'");
            } else {
                System.out.println("Empty input. Please enter a non-empty string.");
            }

            System.out.println("\nEnter another string. Type 'quit' to exit:");
        }

        scanner.close();
    }

    public static char findMostFrequentChar(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty");
        }

        Map<Character, Integer> charFrequency = new HashMap<>();

        for (char c : str.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        char mostFrequent = str.charAt(0);
        int maxFrequency = 0;

        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequent = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        return mostFrequent;
    }
}