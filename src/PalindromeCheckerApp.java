
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Accept input from user
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        // Create a Queue to store characters in FIFO order
        Queue<Character> queue = new LinkedList<>();

        // Create a Stack to store characters in LIFO order
        Stack<Character> stack = new Stack<>();

        // Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);   // Enqueue
            stack.push(c);  // Push
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare characters until the queue becomes empty
        while (!queue.isEmpty()) {

            char fromQueue = queue.remove(); // Dequeue (FIFO)
            char fromStack = stack.pop();    // Pop (LIFO)

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        // Close scanner
        scanner.close();
    }
}