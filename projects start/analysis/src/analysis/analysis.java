/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package analysis;
import java.util.*;
/**
 *
 * @author aikyerim
 */
public class analysis {
    
    public void examres(){
        Scanner in = new Scanner(System.in);
        
        int pass = 0, fail = 0, counter = 1, result;
        while(counter <= 4){
            System.out.println("Enter the result (1->pass 2->fail): \t");
            result = in.nextInt();
            
            if (result==1)
                pass += 1;
            else 
                fail +=1;
            counter += 1;            
        }
        System.out.printf("Passed: %d \n Fail: %d \n", pass, fail);
       
    }
        
    
}
