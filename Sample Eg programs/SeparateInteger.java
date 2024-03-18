import java.util.Scanner;

public class SeparateInteger {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer (A): ");
            int A = scanner.nextInt();
            System.out.print("Enter the number of times to repeat (N): ");
            int N = scanner.nextInt();

            repeatNumber(A, N);
        }
    }

    public static void repeatNumber(int A, int N) {
        for (int i = 0; i < N; i++) {
            System.out.println(A);
        }
    }
}
