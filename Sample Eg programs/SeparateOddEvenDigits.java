import java.util.Scanner;

public class SeparateOddEvenDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int inputNumber = scanner.nextInt();
        
        separateOddEvenDigits(inputNumber);
    }

    public static void separateOddEvenDigits(int number) {
        String numberStr = Integer.toString(number);
        StringBuilder oddDigits = new StringBuilder();
        StringBuilder evenDigits = new StringBuilder();

        for (int i = 0; i < numberStr.length(); i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            if (digit % 2 == 0) {
                evenDigits.append(digit).append(", ");
            } else {
                oddDigits.append(digit).append(", ");
            }
        }

        if (oddDigits.length() > 0) {
            oddDigits.delete(oddDigits.length() - 2, oddDigits.length()); // Remove the last comma and space
            System.out.println("Odd digits: " + oddDigits);
        } else {
            System.out.println("There are no odd digits in the number.");
        }

        if (evenDigits.length() > 0) {
            evenDigits.delete(evenDigits.length() - 2, evenDigits.length()); // Remove the last comma and space
            System.out.println("Even digits: " + evenDigits);
        } else {
            System.out.println("There are no even digits in the number.");
        }
    }
}
