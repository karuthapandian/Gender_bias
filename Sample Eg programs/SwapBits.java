import java.util.Scanner;

public class SwapBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int result = swapBits(n);
        System.out.println("Number after manipulation: " + result);
    }

    public static int swapBits(int n) {
        // Use bitwise AND with masks to extract even and odd bits
        int evenBits = n & 0xAAAAAAAA; // 0xAAAAAAAA represents even bits (1010...1010)
        int oddBits = n & 0x55555555;  // 0x55555555 represents odd bits (0101...0101)

        // Right shift even bits and left shift odd bits to swap them
        evenBits >>= 1;
        oddBits <<= 1;

        // Combine the swapped even and odd bits using bitwise OR
        return evenBits | oddBits;
    }
}
