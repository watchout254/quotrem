
package mehn;
import java.util.Scanner;
public class Mehn {

    public static void main(String[] args) {
        
        
        double a,b;
        Scanner x = new Scanner(System.in);
  
        
        System.out.println("\t\tWelcome, Find the quotient & remainder of 2 numbers!!!");
        System.out.println("Enter number: ");
        a = x.nextDouble();
        
        System.out.println("Enter number: ");
        b = x.nextDouble();
        
        
        double quotient = a / b;
        double remainder = a % b;
        
        System.out.println("quotient is: " +quotient);
        System.out.println("remainder is: "+remainder);
        
        
        
    }
    
}
