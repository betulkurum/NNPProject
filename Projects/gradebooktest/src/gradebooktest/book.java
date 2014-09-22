/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gradebooktest;
import java.util.*;

/**
 *
 * @author asauletkhan
 */
public class book {
    private String coursename;
    
    public void setname(String bla){
        coursename = bla;
    }
    public String getname(){
        return coursename;
    }
    public void displayit(){
        System.out.printf("Welcome to the %s world!", getname());
    }

    public void classav(){
        Scanner scan = new Scanner(System.in);
        int total;
        int gradecounter;
        int grade;
        double average;

        total = 0;
        gradecounter = 0;
        
            System.out.println("\nEnter grade or -1 to exit: ");
            grade = scan.nextInt();
            
            while (grade != -1){
                total += grade;
                gradecounter += 1;

                System.out.println("\n Enter grade or -1 to calculate: ");
                grade = scan.nextInt();
            }
           
            if (gradecounter != 0){
               
                    average = (double)total/gradecounter;

                System.out.printf("\n Total of the %d grades entered is %d ",gradecounter, total );
                System.out.printf("\n Average is : %.2f",average);
                
                classav();
            }else{
                System.out.println("\n No grades were entered.");
            }                                 
    }
    
    
}
