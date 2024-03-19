import java.util.Scanner;

public class bitwise{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int N = scanner.nextInt();

            int[] arr = new int[N];
            System.out.println("Enter the elements:");
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }

            int result = bitwiseXOR(N, arr);
            System.out.println("Bitwise XOR of the elements: " + result);
        }
    }

    public static int bitwiseXOR(int N, int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }
}
