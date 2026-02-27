import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Inject strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();

        // Execute selected strategy
        boolean result = strategy.check(input);

        System.out.println("Is Palindrome? : " + result);

        scanner.close();
    }
}

/**
 * =========================================================
 * INTERFACE – PalindromeStrategy
 * =========================================================
 *
 * This interface defines a contract for all
 * palindrome checking algorithms.
 */
interface PalindromeStrategy {

    boolean check(String input);
}

/**
 * =========================================================
 * CLASS – StackStrategy
 * =========================================================
 *
 * This class provides a Stack based implementation
 * of the PalindromeStrategy interface.
 *
 * It uses LIFO behavior to reverse characters
 * and compare them with the original sequence.
 */
class StackStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using Stack.
     *
     * @param input String to validate
     * @return true if palindrome, false otherwise
     */
    public boolean check(String input) {

        // Create a stack to store characters
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}