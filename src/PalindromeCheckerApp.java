import java.util.Scanner;
import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Use Stack-based strategy (example algorithm)
        PalindromeStrategy strategy = new StackStrategy();

        // Capture start time
        long startTime = System.nanoTime();

        boolean result = strategy.check(input);

        // Capture end time
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + duration + " ns");

        scanner.close();
    }
}

/**
 * Strategy Interface
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * Stack-based palindrome implementation
 */
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        // Push characters onto stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare while popping
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}
