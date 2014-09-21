/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package accounttest;
import java.util.*;
/**
 * Inputting and outputting float-point numbers with account objs.
 * @author aikyerim
 */
public class AccountTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        account a1 = new account(50.00);
        account a2 = new account(-1.25);
        
        //Simply gives the initial value (instance var in class)
        System.out.printf("Account 1 balance is: %.3f \n", a1.getbal());
        System.out.printf("Account 2 balance is: %.3f \n\n", a2.getbal());
        
        //Obtain input
        Scanner b = new Scanner(System.in);
        double depamount;
        
        System.out.println("Enter dep amount for a1:");
        depamount = b.nextDouble();
    
        System.out.printf("Adding %.3f amount for a1 balance...\n", depamount);
        a1.add(depamount);
        
        //display balances
        System.out.printf("a1 balance: %.3f \n", a1.getbal());
        System.out.printf("a2 balance: %.3f \n\n", a2.getbal());
        
        System.out.println("Enter dep amount for a2:");
        depamount = b.nextDouble();
        System.out.printf("Adding %.3f amount for a2...\n\n", depamount);
        a2.add(depamount);
        
        System.out.printf("a1 balance: %.3f \n", a1.getbal());
        System.out.printf("a2 balance: %.3f \n", a2.getbal());
        
        System.out.println("Thank you. See you again.");
        
        
    }    
        
}       
        
        
      
        
        
    
    


