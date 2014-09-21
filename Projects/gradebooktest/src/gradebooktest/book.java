/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gradebooktest;

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
    
    
}
