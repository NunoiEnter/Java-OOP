import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (-1 to stop): ");
        int n = sc.nextInt();

        if (n == -1) {
            System.out.println("No numbers were entered.");
            return;
        }

        int max = n;
        int min = n;

        while (true) {
            System.out.print("Enter a number (-1 to stop): ");
            n = sc.nextInt();

            if (n == -1) break;

            if (n > max) max = n;
            if (n < min) min = n;
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
