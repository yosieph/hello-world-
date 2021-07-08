/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josiadd.loopclass2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class loopclass2 {
    public static void main(String[] args){
    String input;
    int number;
    
    Scanner myScanner= new Scanner(System.in);
    
    boolean isValid = false;
    do{
        
        try{
            
            System.out.println("Please enter whole number: ");
            
            input=myScanner.nextLine();
            number=Integer.parseInt(input);
            
            if (number>=1 && number<=10){
            
            isValid = true;
            }
        } catch(NumberFormatException ex){
            
            System.out.println("That was not whole number: ");
        
        }
    
    } while(!isValid);
    
    
    }
    
}
