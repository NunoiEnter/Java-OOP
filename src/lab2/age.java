import java.util.*;
public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert your name : ");
        String name = sc.nextLine();
        double sal = 0; 
        System.out.print("Please insert your age : ");
        int age = sc.nextInt();
        System.out.print("Please insert number of working days : ");
        int numDay1 = sc.nextInt();
        System.out.print("Please insert number of absent days : ");
        int numDay2 = sc.nextInt();
        System.out.print("Please insert your body weight : ");
        int weight = sc.nextInt();
        
        if (age >= 21 & age <= 30 ){
            sal = (numDay1 * 300) - (numDay2 * 50);
        }
        
        else if (age >= 31 & age <= 40){
            sal = (numDay1 * 500) - (numDay2 * 50);
        }
        
        else if (age >= 41 & age <= 50){
            sal = (numDay1 * 1000) - (numDay2 * 25);
        }
        
        else if (age >= 51 & age <= 60){
            sal = (numDay1 * 3000);
        }

        System.out.println("Hi, "+name);
        System.out.println("Your sal is  "+sal+" Baht");
        
        if (weight >= 10 & weight <= 60){
            sal = sal + 5000;
        
        }
        
        else if(weight >= 61 & weight <= 90){
            sal = sal + (5000 - ((weight-60) * 10));
        }
        
        System.out.println("Your sal and bonus is  "+sal+" Baht");
    }
}