import java.util.Scanner;

public class Maxcharacterfrequency {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the string: ");
            String s = scanner.nextLine();

            int maxFrequency = maxCharacterFrequency(s);
            System.out.println("Maximum character frequency: " + maxFrequency);
        }
    }

    public static int maxCharacterFrequency(String s) {
        int[] frequency = new int[256]; // Assuming ASCII characters

        // Counting frequencies of characters
        for (char c : s.toCharArray()) {
            frequency[c]++;
        }

        int maxFreq = 0;
        for (int freq : frequency) {
            if (freq > maxFreq) {
                maxFreq = freq;
            }
        }

        return maxFreq > 1 ? maxFreq : 0; // If no character repeats, return 0
    }
}
