import java.util.*;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your exercise time 1: ");
        int number1 = input.nextInt();
        System.out.print("Enter your exercise time 2: ");
        int number2 = input.nextInt();
        int total = number1 + number2;
        int hours = total / 3600;
        int minutes = (total % 3600) / 60;
        int seconds = total % 60;
        System.out.println("It is " + hours + " hours " + minutes + " minutes " + seconds + " seconds");

        input.close();
    }

}