import java.util.Scanner;

public class PalindromeCheckerApp {


    public static void main(String[] args) {
        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Accept input from user
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        // Variable to store reversed string
        String reversed = "";

        // Iterate from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);   // String concatenation
        }

        // Compare original and reversed using equals()
        boolean isPalindrome = input.equals(reversed);

        // Display result
        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + reversed);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        // Close scanner
        scanner.close();

    }
}