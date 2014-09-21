/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gradebooktest;

import java.util.*;
/**
 *
 * @author aikyerim
 */
public class GradeBookTest {

    /**
     * learner and author @aikerim
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        book mygradebook = new book();
        System.out.printf("Course name : %s \n\n",mygradebook.getname());
        
        System.out.println("Please, enter the course name:");
        String Name = read.nextLine();
        mygradebook.setname(Name);
        System.out.println();
        
        mygradebook.displayit();
        
    }
    
}
