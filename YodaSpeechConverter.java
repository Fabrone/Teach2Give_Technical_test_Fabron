import java.util.Scanner;

public class YodaSpeechConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Welcome to the Yoda Speech Converter!");
        System.out.println("Enter a sentence to convert :");

        while (true) {
            input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            String yodaSentence = convertToYodaSpeak(input);
            System.out.println("Yoda says: " + yodaSentence);
            System.out.println("\nEnter another sentence .Type 'quit' to exit:");
        }

        scanner.close();
    }

    public static String convertToYodaSpeak(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return "";
        }

        String[] words = sentence.split("\\s+");
        StringBuilder yodaSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            yodaSentence.append(words[i]);
            if (i != 0) {
                yodaSentence.append(" ");
            }
        }

        String result = yodaSentence.toString();
        result = Character.toUpperCase(result.charAt(0)) + result.substring(1);
        if (!result.endsWith(".")) {
            result += ".";
        }

        return result;
    }
}