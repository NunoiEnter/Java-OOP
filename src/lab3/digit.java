import java.util.*;
public class digit {
    public static void main(String[] args) {
        int n , num;
        String text = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of digits: ");
        n = sc.nextInt();
        for (int i = 1;i <= n; i++){
            System.out.print("Enter digit "+i+": ");
            num = sc.nextInt();
            text += num;
        }
        System.out.println("Final Code = " + text);
    }
}