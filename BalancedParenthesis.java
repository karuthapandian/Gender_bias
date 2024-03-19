import java.util.*;

public class BalancedParenthesis {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the string: ");
            String s = scanner.nextLine();

            String result = isBalanced(s) ? "yes" : "no";
            System.out.println(result);
        }
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false; 
                }
                stack.pop(); 
            }
        }

       
        return stack.isEmpty();
    }
}
