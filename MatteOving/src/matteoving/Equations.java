/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matteoving;

import java.util.Scanner;


/**
 *
 * @author Kristoffer
 */
public class Equations {
        //FIELDS
    public Equations() {
       //CONSTRUCTOR
    }

    public void multiplication(int n) {
        System.out.println("Multiplication table of: " + n + ": ");
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(n * i);
        }
    }// end multiplication method
    
    public void division(int n, int d){
        System.out.println(n + " divided by " + d + " is " + n/d);
        
    }//end division method
    
    public void ioAdd() throws InterruptedException{
        boolean x = false;
        
        while(x != true){
        try{
        Scanner input = new Scanner(System.in); //Creates a scanner
        System.out.println("Enter first number: ");
        int n1 = input.nextInt(); // n1 becomes the input to the scanner.
        System.out.println("Enter second number: ");
        int n2 = input.nextInt();
        int sum =n1+n2;
        System.out.println(n1 + " + " + n2 + " = " + sum);
        
        x = true; //Kill if the user finishes correctly. 
        }//end try
        catch(Exception e){
            System.out.println("You cant do that!");
            Thread.sleep(2000);
            
        }//end catch
        }// end while
    }//end inAdd method

    
}//class end

