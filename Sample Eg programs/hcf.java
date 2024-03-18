import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        try (Scanner  = new Scanner(System.in)) {
            System.out.print("Enter the first integer: ");
            Scanner scanner;
            int num1 = scanner.nextInt();
            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            int hcf = findHCF(num1, num2);
            System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        }
    }

    public static int findHCF(int num1, int num2) {
        int hcf = 1;
        for (int i = 2; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        return hcf;
    }
}
