/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.lang.Exception.*;
import java.io.*;
/**
 *
 * @author Esha
 */
public class Exception {
    
    public static void main (String[] args){
        // Some code here
        ArrayList<Integer> list = new ArrayList<>();
        int newElement = 2;

 try {
// more code here 
     list = null;// for example this 'null' will generate an exception.
    list.add(newElement);
    list.add(newElement+1);
    list.add(newElement+2);
// more code here
} catch (NullPointerException ex) { 
    ex.printStackTrace();
    
    
/*
} catch (Exception ex) { 
    ex.printStackTrace();
*/
    
    
// when you throw an expception, the code is evaluated sequentially. 
    //remember that the catches throw sequentially too. So, remmeber that when you use exceptions 
    //you need to put the most specific cases first. The most general exceptions (that catch all) fo at the
    //end!... This is the point of this exercise. Here I have modified it, so that the gernal Exception is right 
    //at the end.

}
    
}
}
