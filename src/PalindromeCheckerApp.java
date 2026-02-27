import java.util.Scanner;

/**
 * =========================================================
 * MAIN CLASS – UseCase11PalindromeCheckerApp
 * =========================================================
 * This class demonstrates palindrome validation using
 * object-oriented design.
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC11
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Create service object
        PalindromeService service = new PalindromeService();

        // Call palindrome logic
        boolean result = service.checkPalindrome(input);

        // Print result
        System.out.println("Is Palindrome? : " + result);

        scanner.close();
    }
}

/**
 * =========================================================
 * SERVICE CLASS – PalindromeService
 * =========================================================
 * Contains only palindrome business logic.
 */
class PalindromeService {

    /**
     * Checks whether the given string is a palindrome.
     *
     * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {

        // Optional: normalize input (ignore case & spaces)
        input = input.replaceAll("\\s+", "").toLowerCase();

        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}