import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int max = 0;
        int min = 0;
        boolean first = true;

        int n = 0;

        while (n != -1) {
            System.out.print("Enter a number (-1 to stop): ");
            n = sc.nextInt();

            if (n == -1) break;

            if (first) {
                max = n;
                min = n;
                first = false;
            } else {
                if (n > max) max = n;
                if (n < min) min = n;
            }
        }
        if (first) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("Maximum = " + max);
            System.out.println("Minimum = " + min);
        }
    }
}
