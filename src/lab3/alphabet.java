import java.util.Scanner;

public class alphabet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String allChars = "";
        String consonants = "";

        while (true) {
            System.out.print("Enter a character: ");
            String s = sc.next();

            if (s.length() != 1) {
                System.out.println("Invalid input. Only lowercase a-z are allowed.");
                continue;
            }

            char c = s.charAt(0);

            if (c == 'z') break;

            if (c < 'a' || c > 'z') {
                System.out.println("Invalid input. Only lowercase a-z are allowed.");
                continue;
            }

            allChars += c;

            if ("aeiou".indexOf(c) == -1)
                consonants += c;
        }

        System.out.println("All characters entered: " + allChars);
        System.out.println("Consonants only: " + consonants);
    }
}
