import java.util.Scanner;

public class string{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int countOnes = countOnesInBinary(n);
        System.out.println("Number of 1's in the binary representation of " + n + ": " + countOnes);
    }

    public static int countOnesInBinary(int n) {
        int count = 0;
        while (n > 0) {
            // Increment count if the least significant bit is 1
            if ((n & 1) == 1) {
                count++;
            }
            // Right shift the number by 1 bit
            n = n >> 1;
        }
        return count;
    }
}
