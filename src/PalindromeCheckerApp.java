import java.util.Scanner;



public class PalindromeCheckerApp {

    /**
     * Application entry point for UC10.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input : ");
        String input = sc.nextLine();

        // Step 1: Normalize string
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Check palindrome
        boolean isPalindrome = true;

        for (int i = 0; i < normalized.length() / 2; i++) {

            if (normalized.charAt(i) !=
                    normalized.charAt(normalized.length() - 1 - i)) {

                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}