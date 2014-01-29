/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Esha
 */
public class CodeFlow {
    
    public static void main(String[] args){
        int userInput = 0;
        CodeFlow test = new CodeFlow();
        test.launch(userInput);
    }
    
    public void launch(int userInput) {
ArrayList<Integer> intList = new ArrayList<Integer>();
intList.add(1);
intList.add(2);
intList.add(3);
intList.add(4);
intList.add(5);
intList.add(6);
try {
intList.remove(0);
System.out.println(intList.get(userInput));
intList.remove(0);
System.out.println(intList.get(userInput));
intList.remove(0);
System.out.println(intList.get(userInput));
intList.remove(0);
System.out.println(intList.get(userInput));
intList.remove(0);
System.out.println(intList.get(userInput));
intList.remove(0);
System.out.println(intList.get(userInput));
intList.remove(0);
System.out.println(intList.get(userInput));
} catch (IndexOutOfBoundsException ex) {
ex.printStackTrace();
}   
}
}
