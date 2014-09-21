/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounttest;

/**
 *
 * @author aikyerim
 */
public class account {
    private double balance;
   
    //constructor
    public account(double initbalance){
        
        if (initbalance > 0.0){
            balance= initbalance;
        }
    
    }
    // add amount to the account    
    public void add(double amount){
            balance += amount;
        }
    //return account balance 
    public double getbal(){  
        return balance;    
    }
}

