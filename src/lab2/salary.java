import java.util.*;

public class salary {
    public static void main(String []args) {
    
    Scanner sc = new Scanner(System.in) ;
    
    double sal = sc.nextDouble();
    sc.close();
    if( sal  <= 50000.00) {
        System.out.println(sal*0.05);
    }
    else{
        System.out.println(sal*0.1);
        }
    }
} 
