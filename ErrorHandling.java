/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Esha
 */
public class ErrorHandling {
    
    public static void main(String[] args){
    ErrorHandling testing = new ErrorHandling();
    testing.launch();
    }
    
    
    public void launch(){
        int specVal = getVal();
        
        while (specVal ==0){
            specVal = getVal();
        }

        
        int counter = 0;
        int sum = 0;
        int average = 0;
        int numbers = 0;
        while (counter<specVal){
        Scanner in = new Scanner(System.in);
        
        try{

        
        System.out.println("Please enter a number");
        String input = in.nextLine();
        int intValue = Integer.parseInt(input);
        numbers = numbers +intValue;
        counter++;
        }
        catch (NumberFormatException ex){
        System.out.println("You have entered a non-integer number. Please "
                + "try again.");
       // ex.printStackTrace();
        }
        }
        
        try{
        average = numbers / specVal;
        System.out.println("The average is: " + average);
        }catch (ArithmeticException ex){
            System.out.println("You cannot divide by zero.");
            }
            
        }
 
    private static int getVal(){

        int count = 0; //default
        try{
        System.out.println("What's the total number of values you want to enter?");
        Scanner value = new Scanner(System.in);
        String val = value.nextLine();
        count = Integer.parseInt(val); 
        } catch(NumberFormatException ex){
        System.out.println("You have entered a non-integer number. Please "
                + "try again.");
        }
        return count;
    }
}


