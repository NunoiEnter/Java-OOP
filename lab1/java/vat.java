import java.util.*;

public class vat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        sc.close();
        double vat = price * 0.07;
        System.out.println(price + vat);
    }
}
