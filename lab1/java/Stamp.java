import java.util.*;

public class Stamp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double buy = sc.nextDouble();
        System.out.println("Total Price : " + buy);
        System.out.println("You got " + (int) buy / 50 + " stamp (s)");
        sc.close();
    }
}
