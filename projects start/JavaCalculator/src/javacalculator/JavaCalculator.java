/*
 * Java Calculator
 */

package javacalculator;
import java.util.*;
/**
 *
 * @author asauletkhan
 * @instrucor rerol
 */
public class JavaCalculator {
    private static int result;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int value1, value2,choice;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome Dear Brain: ");
        
        System.out.println("Enter two values: ");
        value1 = scan.nextInt();
        value2 = scan.nextInt();
        
        menu();
        choice= scan.nextInt();
            while(choice != 0){
            
            if (choice==1 ){
                result = addition(value1,value2);
                printres(result);
                menu();
                choice= scan.nextInt();
                
            }
            if (choice==2 ){
                
                result = subtraction(value1,value2);
                printres(result);
                menu();
                choice= scan.nextInt();
                
                
            }
            if (choice==3 ){
                result = multiplication(value1,value2);
                printres(result);
                menu();  
                choice= scan.nextInt();
               
            }
            if (choice==4 ){
                 if (value1 == 0){
            System.out.println("Undefined. ");
                 }
                 else {
                result = division(value1,value2);
                printres(result);
                menu();
                choice= scan.nextInt();
                
                 }
            
            }
            if (choice == 0 ){
                System.out.println("Thank you.Bye Bye");
            }
        
    }
    }
    private static int addition(int x, int y) {
        return x+y; 
       
    }

    private static int subtraction(int x, int y) {
        return x-y;
          
    }

    private static int multiplication(int x, int y) {
        return x*y;
        
    }

    private static int division(int x, int y) {
        return x/y;    
                   
    }

    private static void menu() { 
        System.out.println("1 -> Addition");
        System.out.println("2 -> Subtraction");
        System.out.println("3 -> Multiplication");
        System.out.println("4 -> Division");
        System.out.println("0 -> Exit");
        System.out.println("Enter the choice: ");      
    }
    private static void printres(int a) {
        System.out.println("The result is "+ a);
    }
    
}
