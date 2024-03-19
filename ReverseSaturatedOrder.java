import java.util.Scanner;

public class ReverseSaturatedOrder {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the string: ");
            String input = scanner.nextLine();

            String[] words = input.split("\\s+");
            String result = reverseSaturatedOrder(words);
            System.out.println("Reverse Saturated Order: " + result);
        }
    }

    public static String reverseSaturatedOrder(String[] words) {
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(reverseString(word)).append(" ");
        }

        return reverseString(sb.toString().trim());
    }

    public static String reverseString(String str) { 
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) { 
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
 